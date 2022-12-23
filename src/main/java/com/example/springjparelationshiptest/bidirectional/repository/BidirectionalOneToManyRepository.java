package com.example.springjparelationshiptest.bidirectional.repository;

import com.example.springjparelationshiptest.bidirectional.BidirectionalOneToMany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidirectionalOneToManyRepository extends JpaRepository<BidirectionalOneToMany, Long> {
}
