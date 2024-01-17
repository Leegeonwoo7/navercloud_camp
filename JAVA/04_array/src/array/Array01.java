package array;

public class Array01 {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[5];
		
		arr[0] = 25;
		arr[1] = 45;
		arr[2] = 30;
		arr[3] = 20;
		arr[4] = 15;
		
		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(i + "번방: ");
			System.out.println(arr[i]);
		}
		System.out.println();
		
		System.out.println("홀수 데이터만");
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println();
		
		System.out.println("향상된 for문");
		for(int tmp : arr) {
			System.out.println(tmp);
		}
	}
}
