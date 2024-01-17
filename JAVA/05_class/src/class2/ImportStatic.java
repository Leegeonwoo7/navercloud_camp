package class2;

import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.String.format;
import static java.util.Arrays.sort;



public class ImportStatic {
	public static void main(String[] args) {
		System.out.println(random());
		System.out.println(pow(3, 4));
		
		System.out.println(format("%.2f", 34.789));
		
		int[] arr = {25, 30, 20 , 78 ,55};
		sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
