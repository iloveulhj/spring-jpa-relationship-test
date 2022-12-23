package com.example.springjparelationshiptest.bidirectional.repository;

import com.example.springjparelationshiptest.bidirectional.BidirectionalOneToOneRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidirectionalOneToOneRootRepository extends JpaRepository<BidirectionalOneToOneRoot, Long> {
}
