package for_;

import java.io.IOException;

public class For02 {
	public static void main(String[] args) throws IOException {
		System.out.println("원하는 단을 입력: ");
		int dan = System.in.read() - '0';
		
		for(int i=dan; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}
		System.out.println();
		
	}
}

/*

원하는 단을 입력 : 2 (System.in.read() 사용)
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
*/