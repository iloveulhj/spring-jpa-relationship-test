package com.example.springjparelationshiptest.bidirectional.repository;

import com.example.springjparelationshiptest.bidirectional.BidirectionalManyToOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidirectionalManyToOneRepository extends JpaRepository<BidirectionalManyToOne, Long> {
}
