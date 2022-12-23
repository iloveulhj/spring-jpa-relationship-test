package com.example.springjparelationshiptest.bidirectional;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BidirectionalOneToOneBranch {
	@Id
	private Long id;
	@OneToOne(optional = true, mappedBy = "branch")
	private BidirectionalOneToOneRoot root;
}
