package com.example.springjparelationshiptest.unidirectional;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UnidirectionalOneToManyRoot {
	@Id
	@GeneratedValue
	private Long id;

	@OneToMany(fetch = FetchType.EAGER)
	private Collection<UnidirectionalOneToManyBranch> branches;
}
