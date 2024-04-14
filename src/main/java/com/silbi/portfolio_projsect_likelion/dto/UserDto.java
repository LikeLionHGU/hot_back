package com.silbi.portfolio_projsect_likelion.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
	private Long userId;
	private String nickName;
	private String characterImage;
	private int personalSpicyLevel;

}
