package CompareTheMarket.example.demo.service;

import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.model.QuoteRequest;

import java.util.concurrent.CompletableFuture;

public interface QuoteProvider {

    CompletableFuture<Quote> generateQuote(QuoteRequest request);
    
}
