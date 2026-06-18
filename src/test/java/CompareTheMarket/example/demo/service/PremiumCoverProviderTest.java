package CompareTheMarket.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.Test;

import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.model.QuoteRequest;

public class PremiumCoverProviderTest {
    
    @Test
    void shouldCalculateCorrectQuote() {
        PremiumCoverProvider provider = new PremiumCoverProvider();

        QuoteRequest request = new QuoteRequest(25, 15000, 5, 1);

        CompletableFuture<Quote> future = provider.generateQuote(request);

        Quote quote = future.join();

        assertEquals(890.0, quote.getPrice());
        assertEquals("PremiumCover", quote.getProvider());
        assertEquals(200, quote.getExcess());
    }
}