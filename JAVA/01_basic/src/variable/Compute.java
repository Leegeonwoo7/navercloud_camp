package variable;

import java.text.DecimalFormat;

public class Compute {

	public static void main(String[] args) {
		short a = 320;
		short b = 258;
		
		short sum = (short)(a + b);
		short min = (short)(a - b);
		int mul = a * b;
		double div = (double)a / b;
		
		System.out.println(a + " + " + b + " = " + sum); // a, 'a' - 320, 97
		System.out.println(a + " - " + b + " = " + min);
		System.out.println(a + " * " + b + " = " + new DecimalFormat().format(mul));
		System.out.println(a + " / " + b + " = " + String.format("%.2f", div));
	}
}
/*
[문제] 변수를 이용하여 320, 258의 합, 차, 곱, 몫을 구하시오
[실행결과]
320 + 258 = xxx
320 - 258 = xxx
320 * 258 = xxx
320 / 258 = 1.24031007751938
 */
