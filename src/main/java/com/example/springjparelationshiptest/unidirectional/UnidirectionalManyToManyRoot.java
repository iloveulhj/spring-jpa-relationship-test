package com.example.springjparelationshiptest.unidirectional;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UnidirectionalManyToManyRoot {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<UnidirectionalManyToManyBranch> branches;
}
