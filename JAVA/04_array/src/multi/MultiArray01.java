package multi;

public class MultiArray01 {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;
		
		
		
		for(int i=0; i<arr.length; i++) {
		System.out.println("arr["+ i +"] = " + arr[i]);
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
