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

        double price =
            400 +
            (request.getVehicleValue() * 0.01) -
            (request.getClaims() * 100);

        Quote quote = new Quote("BudgetCover", price, 250);

        return CompletableFuture.completedFuture(quote);
    }
}
