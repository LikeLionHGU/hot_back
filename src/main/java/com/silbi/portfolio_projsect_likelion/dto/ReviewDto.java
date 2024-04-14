package com.silbi.portfolio_projsect_likelion.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewDto {

	private Long reviewId;
	private String comment;
	private int storeSpicyLevel;
	private String storeName;


}
