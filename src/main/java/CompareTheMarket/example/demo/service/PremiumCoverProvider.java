package CompareTheMarket.example.demo.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.model.QuoteRequest;

@Service
public class PremiumCoverProvider implements QuoteProvider {
    
    @Override
    @Async
    public CompletableFuture<Quote> generateQuote(QuoteRequest request) {

        double price =
            600 +
            (request.getVehicleValue() * 0.02) -
            (request.getClaims() * 10);

        Quote quote = new Quote("PremiumCover", price, 200);

        return CompletableFuture.completedFuture(quote);
    }
}