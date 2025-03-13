package module2_Programs;

public class MathClass_Methods {

	public static void main(String[] args) {
		// Math class is final class in java which has static methods
		//method overloading
		System.out.println("addExact_int: "+Math.addExact(45, 65));
		System.out.println("addExact_Long: "+Math.addExact(544654545454L, 3454534553454353L));
		
		System.out.println(Math.subtractExact(45, 25));
		System.out.println(Math.subtractExact(4757567567655L, 251122111111L));
		
		System.out.println(Math.multiplyExact(45, 25));
		System.out.println(Math.multiplyExact(454656464564L, 25));
		System.out.println(Math.multiplyExact(23, 454656464564L));
		System.out.println(Math.multiplyExact(4544564L,4656464564L));
		// max 4 methods
		System.out.println(Math.max(36.6454545454, 36.74645646));
		System.out.println(Math.max(12.35f, 12.358f));
		System.out.println(Math.max(36, 28));
		System.out.println(Math.max(4545454545455L, 655654545454L));
		// min methods
		System.out.println(Math.min(36.6454545454, 36.74645646));
		System.out.println(Math.min(12.35f, 12.358f));
		System.out.println(Math.min(36, 28));
		System.out.println(Math.min(4545454545455L, 655654545454L));
		// abs
		System.out.println(Math.abs(-6954.6));
		System.out.println(Math.abs(-69.6f));
		System.out.println(Math.abs(-66));
		System.out.println(Math.abs(-6954545533L));
		
		double pivalue=Math.PI;
		System.out.println(pivalue);
		System.out.println(Math.cbrt(27));
		//random is method in Math class which generates random unique values of double decimal values
		System.out.println(5+Math.random());
	}

}
