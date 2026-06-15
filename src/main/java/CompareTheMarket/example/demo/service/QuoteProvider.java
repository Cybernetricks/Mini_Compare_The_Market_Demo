package CompareTheMarket.example.demo.service;

import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.model.QuoteRequest;

public interface QuoteProvider {

    Quote generateQuote(
        QuoteRequest request
    );
    
}
