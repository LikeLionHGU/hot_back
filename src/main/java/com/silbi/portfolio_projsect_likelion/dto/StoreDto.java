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
public class StoreDto {

	private Long storeId;
	private String storeName;
	private String x_axis;
	private String y_axis;
	private int storeSpicyLevel;
	private String localNumberAddress;
	private String loadNameAddress;
	private String phoneNumber;


}
