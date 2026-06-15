package CompareTheMarket.example.demo.service;

import org.springframework.stereotype.Service;

import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.model.QuoteRequest;

@Service
public class BudgetCoverProvider implements QuoteProvider {
    
    @Override
    public Quote generateQuote(QuoteRequest request) {

        double price =
            400 +
            (request.getVehicleValue() * 0.01) +
            (request.getClaims() * 100);

        return new Quote("BudgetCover", price, 250);
    }
}
