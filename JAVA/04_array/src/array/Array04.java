package array;

public class Array04 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random() * 100 + 1);
			arr[i] = random;
		}
		
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}

/*
1~100 난수를 발생하여 배열에 저장 후 데이터를 출력하고 최대값, 최소값을 구하시오.

[실행결과]
35 57 .... 30 
최대값: 57
최소값: 30
*/
