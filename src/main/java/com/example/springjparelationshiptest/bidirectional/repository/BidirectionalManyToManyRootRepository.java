package com.example.springjparelationshiptest.bidirectional.repository;

import com.example.springjparelationshiptest.bidirectional.BidirectionalManyToManyRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidirectionalManyToManyRootRepository extends JpaRepository<BidirectionalManyToManyRoot, Long> {
}
