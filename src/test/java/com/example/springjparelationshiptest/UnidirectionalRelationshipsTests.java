package com.example.springjparelationshiptest;

import com.example.springjparelationshiptest.unidirectional.UnidirectionalManyToManyRoot;
import com.example.springjparelationshiptest.unidirectional.UnidirectionalManyToOneRoot;
import com.example.springjparelationshiptest.unidirectional.UnidirectionalOneToManyRoot;
import com.example.springjparelationshiptest.unidirectional.UnidirectionalOneToOneRoot;
import com.example.springjparelationshiptest.unidirectional.repository.UnidirectionalManyToManyRootRepository;
import com.example.springjparelationshiptest.unidirectional.repository.UnidirectionalManyToOneRootRepository;
import com.example.springjparelationshiptest.unidirectional.repository.UnidirectionalOneToManyRootRepository;
import com.example.springjparelationshiptest.unidirectional.repository.UnidirectionalOneToOneRootRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UnidirectionalRelationshipsTests {
	@Autowired
	private UnidirectionalManyToManyRootRepository manyToManyRootRepository;
	@Autowired
	private UnidirectionalManyToOneRootRepository manyToOneRootRepository;
	@Autowired
	private UnidirectionalOneToManyRootRepository oneToManyRootRepository;
	@Autowired
	private UnidirectionalOneToOneRootRepository oneToOneRootRepository;
	@Autowired
	private EntityManager entityManager;

	@Test
	public void manyToManyRoot() {
		entityManager.createQuery("select x from UnidirectionalManyToManyRoot x join UnidirectionalManyToManyBranch y where x.id = 0", UnidirectionalManyToManyRoot.class).getResultList();
		entityManager.createQuery("select x from UnidirectionalManyToManyRoot x left join UnidirectionalManyToManyBranch y where x.id = 0", UnidirectionalManyToManyRoot.class).getResultList();
		entityManager.find(UnidirectionalManyToManyRoot.class, 0L);
		manyToManyRootRepository.findById(0L);
	}


	@Test
	public void oneToManyRoot() {
		entityManager.createQuery("select x from UnidirectionalOneToManyRoot x join UnidirectionalOneToManyBranch y where x.id = 0", UnidirectionalOneToManyRoot.class).getResultList();
		entityManager.createQuery("select x from UnidirectionalOneToManyRoot x left join UnidirectionalOneToManyBranch y where x.id = 0", UnidirectionalOneToManyRoot.class).getResultList();
		entityManager.find(UnidirectionalOneToManyRoot.class, 0L);
		oneToManyRootRepository.findById(0L);
	}

	@Test
	public void manyToOneRoot() {
		entityManager.createQuery("select x from UnidirectionalManyToOneRoot x join UnidirectionalManyToOneBranch y where x.id = 0", UnidirectionalManyToOneRoot.class).getResultList();
		entityManager.createQuery("select x from UnidirectionalManyToOneRoot x left join UnidirectionalManyToOneBranch y where x.id = 0", UnidirectionalManyToOneRoot.class).getResultList();
		entityManager.find(UnidirectionalManyToOneRoot.class, 0L);
		manyToOneRootRepository.findById(0L);
	}

	@Test
	public void oneToOneRoot() {
		entityManager.createQuery("select x from UnidirectionalOneToOneRoot x join UnidirectionalOneToOneBranch y where x.id = 0", UnidirectionalOneToOneRoot.class).getResultList();
		entityManager.createQuery("select x from UnidirectionalOneToOneRoot x left join UnidirectionalOneToOneBranch y where x.id = 0", UnidirectionalOneToOneRoot.class).getResultList();
		entityManager.find(UnidirectionalOneToOneRoot.class, 0L);
		oneToOneRootRepository.findById(0L);
	}
}
