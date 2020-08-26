package com.flamebom.ironcoals.helpers;

public class CoalHelper {
	
	public static double CoalMultiplier(int CoalBurnTime) {
		double multiplier = CoalBurnTime/1200;
		multiplier *=10;
		multiplier = Math.round(multiplier);
		multiplier /=10;
		return multiplier;
	}
}
