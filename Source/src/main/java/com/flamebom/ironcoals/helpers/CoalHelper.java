package com.flamebom.ironcoals.helpers;

public class CoalHelper {
	
	public static double CoalMultiplier(int CoalBurnTime) {
		double multiplier = (double)CoalBurnTime/1600;
		multiplier = (double)multiplier *10;
		multiplier = Math.round(multiplier);
		multiplier= (double)multiplier /10;
		return multiplier;
	}
}
