package CompareTheMarket.example.demo.service;

import org.springframework.stereotype.Service;

import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.model.QuoteRequest;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class QuoteService {
    private final List<QuoteProvider> providers;

    public QuoteService(List<QuoteProvider> providers) {

        this.providers = providers;
    }

     public List<Quote> generateQuotes(QuoteRequest request) {

        List<CompletableFuture<Quote>> futures =
                providers.stream()
                        .map(provider ->
                                provider.generateQuote(request))
                        .toList();

        CompletableFuture.allOf(
                futures.toArray(
                        new CompletableFuture[0]
                )
        ).join();

        return futures.stream()
                .map(CompletableFuture::join)
                .toList();
    }
}
