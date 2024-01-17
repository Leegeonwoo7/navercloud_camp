package array;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {35, 46, 25, 72, 50};
		
		System.out.println("정렬 전: ");
		for(int data : arr) {
			System.out.println(data + "  ");
		}
		System.out.println();
		
		
		//선택정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("정렬 후: ");
		for(int data : arr) {
			System.out.println(data + "  ");
		}
		System.out.println();
	}
}
