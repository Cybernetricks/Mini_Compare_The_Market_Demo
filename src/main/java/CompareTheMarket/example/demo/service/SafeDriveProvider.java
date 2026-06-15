package CompareTheMarket.example.demo.service;

import org.springframework.stereotype.Service;

import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.model.QuoteRequest;

@Service
public class SafeDriveProvider implements QuoteProvider {

    @Override
    public Quote generateQuote(QuoteRequest request) {

        double price =
                550 +
                (request.getVehicleValue() * 0.015) -
                (request.getYearsDriving() * 10);

        return new Quote("SafeDrive", price, 150);
    }
}
