package CompareTheMarket.example.demo.service;

import org.springframework.stereotype.Service;

import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.model.QuoteRequest;

import java.util.List;

@Service
public class QuoteService {
    private final List<QuoteProvider> providers;

    public QuoteService(
            List<QuoteProvider> providers) {

        this.providers = providers;
    }

     public List<Quote> generateQuotes(QuoteRequest request) {

        return providers.stream()
                .map(p -> p.generateQuote(request))
                .toList();
    }
}
