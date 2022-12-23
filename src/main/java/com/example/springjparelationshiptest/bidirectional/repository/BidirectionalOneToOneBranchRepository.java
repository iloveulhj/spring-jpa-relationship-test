package com.example.springjparelationshiptest.bidirectional.repository;

import com.example.springjparelationshiptest.bidirectional.BidirectionalOneToOneBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidirectionalOneToOneBranchRepository extends JpaRepository<BidirectionalOneToOneBranch, Long> {
}
