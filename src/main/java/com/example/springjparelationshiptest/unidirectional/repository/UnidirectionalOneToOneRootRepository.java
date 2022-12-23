package com.example.springjparelationshiptest.unidirectional.repository;

import com.example.springjparelationshiptest.unidirectional.UnidirectionalOneToOneRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidirectionalOneToOneRootRepository extends JpaRepository<UnidirectionalOneToOneRoot, Long> {
}
