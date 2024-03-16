package util;

public class currencyConverter {

	public static final double IOF = 0.06;

	public static double dollarPrice;
	public static double realBought;

	public static double converter() {
		double converter = (dollarPrice * realBought);
		double calc = converter += converter * IOF;
		return calc;
	}

}
