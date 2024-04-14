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
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long storeId;

	@Column(nullable = false)
	private String storeName;

	@Column(nullable = false)
	private String x_axis;

	@Column(nullable = false)
	private String y_axis;

	@Column(nullable = false)
	private int storeSpicyLevel;

	private String localNumberAddress;

	private String loadNameAddress;

	private String phoneNumber;


}
