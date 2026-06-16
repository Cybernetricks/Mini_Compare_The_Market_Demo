package CompareTheMarket.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.model.QuoteRequest;

public class QuoteServiceTest {
    
    @Test
    void shouldReturnQuotesFromAllProviders() {

        List<QuoteProvider> providers = List.of(
            new BudgetCoverProvider(),
            new SafeDriveProvider()
        );

        QuoteService quoteService = new QuoteService(providers);

        QuoteRequest request = new QuoteRequest(25, 15000, 5, 1);

        List<Quote> quotes = quoteService.generateQuotes(request);

        assertEquals(2, quotes.size());

        assertTrue(
            quotes.stream()
                    .anyMatch(q ->
                            q.getProvider().equals("BudgetCover")));

        assertTrue(
            quotes.stream()
                    .anyMatch(q ->
                            q.getProvider().equals("SafeDrive")));
    }

    @Test
    void shouldReturnEmptyListWhenNoProvidersExist() {

        QuoteService quoteService =
                new QuoteService(List.of());

        QuoteRequest request =
                new QuoteRequest(17, 1, 0, 0);

        List<Quote> quotes =
                quoteService.generateQuotes(request);

        assertTrue(quotes.isEmpty());
    }
}
