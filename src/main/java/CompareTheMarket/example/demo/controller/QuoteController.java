package CompareTheMarket.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CompareTheMarket.example.demo.model.QuoteRequest;
import CompareTheMarket.example.demo.model.Quote;
import CompareTheMarket.example.demo.service.QuoteService;

import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/quotes")
public class QuoteController {
    
    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @PostMapping
    public List<Quote> getQuotes(@Valid @RequestBody QuoteRequest request) {
        return quoteService.generateQuotes(request);
    }
}
