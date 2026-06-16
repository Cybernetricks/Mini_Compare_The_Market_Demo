package CompareTheMarket.example.demo.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.model.QuoteRequest;

@Service
public class SafeDriveProvider implements QuoteProvider {

    @Override
    @Async
    public CompletableFuture<Quote> generateQuote(QuoteRequest request) {

        double price =
                550 +
                (request.getVehicleValue() * 0.015) -
                (request.getYearsDriving() * 10);

        Quote quote = new Quote("SafeDrive", price, 150);

        return CompletableFuture.completedFuture(quote);
    }
}
