package com.example.springjparelationshiptest.bidirectional;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BidirectionalManyToManyBranch {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<BidirectionalManyToManyRoot> roots;
}
