package com.example.springjparelationshiptest.unidirectional.repository;

import com.example.springjparelationshiptest.unidirectional.UnidirectionalOneToManyRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidirectionalOneToManyRootRepository extends JpaRepository<UnidirectionalOneToManyRoot, Long> {
}
