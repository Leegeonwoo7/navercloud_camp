package variable;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //System.in -> 키보드를 통해서 입력을 받아준다는 의미
		
		System.out.print("정수 입력: ");
		int a = sc.nextInt();
		System.out.print("실수 입력: ");
		double b = sc.nextDouble();
		
		System.out.println(a + " + " + b + " = " + (a+b));
	}

}
