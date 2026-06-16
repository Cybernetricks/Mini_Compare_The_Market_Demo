package CompareTheMarket.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.Test;

import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.model.QuoteRequest;

public class BudgetCoverProviderTest {
    
    @Test
    void shouldCalculateCorrectQuote() {
        BudgetCoverProvider provider = new BudgetCoverProvider();

        QuoteRequest request = new QuoteRequest(25, 15000, 5, 1);

        CompletableFuture<Quote> future = provider.generateQuote(request);

        Quote quote = future.join();

        assertEquals(450.0, quote.getPrice());
        assertEquals("BudgetCover", quote.getProvider());
        assertEquals(250, quote.getExcess());
    }
}
