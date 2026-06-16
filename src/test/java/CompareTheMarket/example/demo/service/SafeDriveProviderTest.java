package CompareTheMarket.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.model.QuoteRequest;

public class SafeDriveProviderTest {
    
    @Test
    void shouldCalculateCorrectQuote() {
        SafeDriveProvider provider = new SafeDriveProvider();

        QuoteRequest request = new QuoteRequest(25, 15000, 5, 1);

        Quote quote = provider.generateQuote(request);

        assertEquals(725.0, quote.getPrice());
        assertEquals("SafeDrive", quote.getProvider());
        assertEquals(150, quote.getExcess());
    }
}
