package co.edu.cue.practicaSpring_.repository;

import co.edu.co.spring.demo.domain.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepository extends JpaRepository<Transaction, Integer> {
}
