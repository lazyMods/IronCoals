package net.marcosantos.ironcoals;

public class CoalHelper {

	public static double coalMultiplier(int burntime) {
		double mul = (double) burntime / 1600;
		mul *= 10;
		mul = Math.round(mul);
		mul /= 10;
		return mul;
	}
}
