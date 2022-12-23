package com.example.springjparelationshiptest.unidirectional;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UnidirectionalOneToOneRoot {
	@Id
	@GeneratedValue
	private Long id;

	@OneToOne(optional = true)
	private UnidirectionalOneToOneBranch branch;
}
