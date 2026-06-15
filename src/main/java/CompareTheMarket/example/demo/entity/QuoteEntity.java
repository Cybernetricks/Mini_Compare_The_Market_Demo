package CompareTheMarket.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class QuoteEntity {
    
    @Id
    @GeneratedValue
    private Long id;

    private String provider;

    private double price;
}
