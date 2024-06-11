package com.example.hotspot_local.controller.response.AboutMap;

import lombok.Data;

import java.util.ArrayList;

// ArrayList화 해서 프론트한테 던지면 되는 거겠지..?
@Data
public class StoreReviewInfo {
	private ArrayList<Double> spicyLevelList; // spicyLevel[0] = review 전체 평균, [1] = 맵구 평균, [2] = 맵노스 평균 ,[3] = 맵물주 평균, [4] = 위암 플래너 평균, [5] = 실비요정 평균
	private ArrayList<Integer> reviewCountList;

	public StoreReviewInfo(ArrayList<Double> spicyLevelList, ArrayList<Integer> reviewCountList) {
		this.spicyLevelList = spicyLevelList;
		this.reviewCountList = reviewCountList;
	}
}
