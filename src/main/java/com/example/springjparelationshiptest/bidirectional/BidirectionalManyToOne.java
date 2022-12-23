package com.example.springjparelationshiptest.bidirectional;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BidirectionalManyToOne {
	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER, optional = true)
	private BidirectionalOneToMany oneToMany;
}
