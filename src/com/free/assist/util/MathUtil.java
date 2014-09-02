package com.free.assist.util;

import java.math.BigDecimal;

public class MathUtil {
	public static Float div(double v1, double v2, int scale) throws Exception {
		if (scale < 0) {
			throw new Exception("the scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).floatValue();
	}
}
