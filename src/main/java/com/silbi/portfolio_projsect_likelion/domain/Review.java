package com.silbi.portfolio_projsect_likelion.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long reviewId;

	private String comment;

	@Column(nullable = false)
	private int storeSpicyLevel;

	private String reviewImage;

	@Column(nullable = false)
	private String storeName;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "userId")
//	private User user;

}
