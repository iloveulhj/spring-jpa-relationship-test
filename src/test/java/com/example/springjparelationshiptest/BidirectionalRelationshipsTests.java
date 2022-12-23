package com.example.springjparelationshiptest;

import com.example.springjparelationshiptest.bidirectional.*;
import com.example.springjparelationshiptest.bidirectional.repository.*;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BidirectionalRelationshipsTests {
	@Autowired
	private BidirectionalManyToManyRootRepository manyToManyRootRepository;
	@Autowired
	private BidirectionalManyToManyBranchRepository manyToManyBranchRepository;
	@Autowired
	private BidirectionalManyToOneRepository manyToOneRepository;
	@Autowired
	private BidirectionalOneToManyRepository oneToManyRepository;
	@Autowired
	private BidirectionalOneToOneRootRepository oneToOneRootRepository;
	@Autowired
	private BidirectionalOneToOneBranchRepository oneToOneBranchRepository;
	@Autowired
	private EntityManager entityManager;

	@Test
	public void manyToManyRoot() {
		entityManager.createQuery("select x from BidirectionalManyToManyRoot x join BidirectionalManyToManyBranch y where x.id = 0", BidirectionalManyToManyRoot.class).getResultList();
		entityManager.createQuery("select x from BidirectionalManyToManyRoot x left join BidirectionalManyToManyBranch y where x.id = 0", BidirectionalManyToManyRoot.class).getResultList();
		entityManager.find(BidirectionalManyToManyRoot.class, 0L);
		manyToManyRootRepository.findById(0L);
	}

	@Test
	public void manyToManyBranch() {
		entityManager.createQuery("select x from BidirectionalManyToManyBranch x join BidirectionalManyToManyRoot y where x.id = 0", BidirectionalManyToManyBranch.class).getResultList();
		entityManager.createQuery("select x from BidirectionalManyToManyBranch x left join BidirectionalManyToManyRoot y where x.id = 0", BidirectionalManyToManyBranch.class).getResultList();
		entityManager.find(BidirectionalManyToManyBranch.class, 0L);
		manyToManyBranchRepository.findById(0L);
	}

	@Test
	public void oneToMany() {
		entityManager.createQuery("select x from BidirectionalOneToMany x join BidirectionalManyToOne y where x.id = 0", BidirectionalOneToMany.class).getResultList();
		entityManager.createQuery("select x from BidirectionalOneToMany x left join BidirectionalManyToOne y where x.id = 0", BidirectionalOneToMany.class).getResultList();
		entityManager.find(BidirectionalOneToMany.class, 0L);
		oneToManyRepository.findById(0L);
	}

	@Test
	public void manyToOne() {
		entityManager.createQuery("select x from BidirectionalManyToOne x join BidirectionalOneToMany y where x.id = 0", BidirectionalManyToOne.class).getResultList();
		entityManager.createQuery("select x from BidirectionalManyToOne x left join BidirectionalOneToMany y where x.id = 0", BidirectionalManyToOne.class).getResultList();
		entityManager.find(BidirectionalManyToOne.class, 0L);
		manyToOneRepository.findById(0L);
	}

	@Test
	public void oneToOneRoot() {
		entityManager.createQuery("select x from BidirectionalOneToOneRoot x join BidirectionalOneToOneBranch y where x.id = 0", BidirectionalOneToOneRoot.class).getResultList();
		entityManager.createQuery("select x from BidirectionalOneToOneRoot x left join BidirectionalOneToOneBranch y where x.id = 0", BidirectionalOneToOneRoot.class).getResultList();
		entityManager.find(BidirectionalOneToOneRoot.class, 0L);
		oneToOneRootRepository.findById(0L);
	}

	@Test
	public void oneToOneBranch() {
		entityManager.createQuery("select x from BidirectionalOneToOneBranch x join BidirectionalOneToOneRoot y where x.id = 0", BidirectionalOneToOneBranch.class).getResultList();
		entityManager.createQuery("select x from BidirectionalOneToOneBranch x left join BidirectionalOneToOneRoot y where x.id = 0", BidirectionalOneToOneBranch.class).getResultList();
		entityManager.find(BidirectionalOneToOneBranch.class, 0L);
		oneToOneBranchRepository.findById(0L);
	}
}
