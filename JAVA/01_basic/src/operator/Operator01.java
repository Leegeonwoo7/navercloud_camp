package operator;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		int money;
		Scanner sc = new Scanner(System.in);
		money = 5723;//sc.nextInt();
		
		int a = money / 1000;
		money %= 1000;
		
		int b = money / 100;
		money %= 100;
		
		int c = money / 10;
		money %= 10;
		
		int d = money;
		System.out.println("천원: " + a);
		System.out.println("백원: " + b);
		System.out.println("십원: " + c);
		System.out.println("일원: " + d);
	}
}


