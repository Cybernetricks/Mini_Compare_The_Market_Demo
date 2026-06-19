package CompareTheMarket.example.demo.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.model.QuoteRequest;

@Service
public class BudgetCoverProvider implements QuoteProvider {
    
    @Override
    @Async
    public CompletableFuture<Quote> generateQuote(QuoteRequest request) {

        double price = generatePrice(request.getVehicleValue(), request.getClaims());

        Quote quote = new Quote("BudgetCover", price, 250);

        return CompletableFuture.completedFuture(quote);
    }

    private double generatePrice(double vehicleValue, double claims) {

        double price =
            400 +
            (vehicleValue * 0.01) -
            (claims * 100);

        return price;
    }
}
