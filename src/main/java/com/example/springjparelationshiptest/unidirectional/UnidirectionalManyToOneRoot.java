package com.example.springjparelationshiptest.unidirectional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UnidirectionalManyToOneRoot {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(optional = true)
	private UnidirectionalManyToOneBranch branch;
}
