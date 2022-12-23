package com.example.springjparelationshiptest.unidirectional.repository;

import com.example.springjparelationshiptest.unidirectional.UnidirectionalManyToManyRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidirectionalManyToManyRootRepository extends JpaRepository<UnidirectionalManyToManyRoot, Long> {
}
