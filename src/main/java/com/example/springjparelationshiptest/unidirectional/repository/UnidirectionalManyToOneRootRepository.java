package com.example.springjparelationshiptest.unidirectional.repository;

import com.example.springjparelationshiptest.unidirectional.UnidirectionalManyToOneRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidirectionalManyToOneRootRepository extends JpaRepository<UnidirectionalManyToOneRoot, Long> {
}
