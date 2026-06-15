package CompareTheMarket.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CompareTheMarket.example.demo.entity.QuoteEntity;

@Repository
public interface QuoteRepository extends JpaRepository<QuoteEntity, Long> {
    
}
