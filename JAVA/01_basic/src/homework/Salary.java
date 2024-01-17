package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = sc.nextLine();
		System.out.print("직급 입력: ");
		String position = sc.nextLine();
		System.out.print("기본급 입력: ");
		int baseSalary = sc.nextInt();
		System.out.print("수당 입력: ");
		int allowance = sc.nextInt();
		
		int totalSalary = baseSalary + allowance;
		//tax로 세금을 더한 값을 바로 받지 않고 rate로 세율을 나눠 따로 세금을 구해주는게 가독성이 높을지도
		double tax = totalSalary >= 5000000 ? totalSalary * 0.03 : totalSalary >= 3000000 ? totalSalary * 0.02 : totalSalary * 0.01; 
		
//		if(totalSalary >= 5_000_000) {
//			tax = totalSalary * 0.03;
//		}else if(totalSalary >= 3_000_000) {
//			tax = totalSalary * 0.02;
//		}else {
//			tax = totalSalary * 0.01;
//		}
		
		int monthSalary = (int)(totalSalary - tax);
		
		DecimalFormat decimal = new DecimalFormat();
		System.out.println("*** " + name + " " + position + "월급 ***");
		System.out.println("기본급 : " + decimal.format(baseSalary));
		System.out.println("수당 : " + decimal.format(allowance));
		System.out.println("합계 : " + decimal.format(totalSalary));
		System.out.println("세금 : " + decimal.format(tax));
		System.out.println("월급 : " + decimal.format(monthSalary));
	}
}

//System.out.println(100000 * 0.01); // 1%
//new DecimalFormat().format(mul)); 구분자 메서드
/*
[조건]
1. 조건연산자 이용
2. 숫자는 3자리마다 , 표시
3. 소수이하는 표시하지 않는다. (정수) 
 
[문제] 월급 계산 프로그램 - 조건 연산자
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
단 합계가 5,000,000원 이상이면 3%
       3,000,000원 이상이면 2%
       아니면 1%
       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원
*/
