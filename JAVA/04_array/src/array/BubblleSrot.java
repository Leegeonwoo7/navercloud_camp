package array;

public class BubblleSrot {
	 public static void main(String[] args) {
		int[] arr = {35, 48, 25, 72, 50};
		
		System.out.print("정렬 전: ");
		for(int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		
		System.out.print("정렬 후: ");
		for(int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
}
