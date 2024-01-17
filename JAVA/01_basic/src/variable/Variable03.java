package variable;

import java.util.Random;

public class Variable03 {

	public static void main(String[] args) {
		int max = Math.max(35, 20);
		System.out.println(max);
		
		double min = Math.min(40.6, 15.3);
		System.out.println(min);
		
		int sum = 2 + 5;
		System.out.println("합 = " + sum);
		int sum2 = '2'-48 + '5'-'0'; //50 + 53
		System.out.println("합 = " + sum2);
		
		int sum3 = Integer.parseInt("2") + Integer.parseInt("5");
		System.out.println("합 = " + sum3);
		
		float a = Float.parseFloat("43.8f");
		double b = Double.parseDouble("43.8");
		double c = a + b;
		System.out.println("합 = " + c);
													 // 65 ~ 90사이의 난수를 구하기 위한 공식
		int d = (int)(Math.random() * 26 + 65); // Math.random() * (y-x+1) + x)
		System.out.println(d);
		System.out.println((char)d);
		
		double e = new Random().nextDouble();
		System.out.println(e);
	}
}

/*
 * 난수
 * -> 컴퓨터가 불규칙하게 발생하는 수
 * 0 <= 난수 < 1
*/