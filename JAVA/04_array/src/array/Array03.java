package array;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 입력: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] 입력 :" );
			int num = sc.nextInt();
			arr[i] = num;
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
/*
ar[0]입력: 25
ar[1]입력: 12
ar[2]입력: 37

의 합은?
*/
