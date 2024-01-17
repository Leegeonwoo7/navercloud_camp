package constructor;

import java.util.Scanner;

public class ComputeMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Compute[] cArr = new Compute[3];

		for (int i = 0; i < cArr.length; i++) {
			System.out.print("x 입력: ");
			int x = sc.nextInt();
			System.out.print("y 입력: ");
			int y = sc.nextInt();

			cArr[i] = new Compute(x, y);
			cArr[i].calc();
		}

		System.out.println("X\tY\tSUM\tSUB\tMul\tDIV" );
		for (int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i].getX() + "\t" 
							+ cArr[i].getY() + "\t" 
							+ cArr[i].getSum() + "\t"
							+ cArr[i].getSub() + "\t" 
							+ cArr[i].getMul() + "\t" 
							+ String.format("%.2f", cArr[i].getDiv()));
		}
		sc.close();
							
	}
}

/*

*/
