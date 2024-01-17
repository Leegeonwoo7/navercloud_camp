package multi;

import java.io.IOException;

public class MultiFor02 {
	public static void main(String[] args)throws IOException {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		System.out.println();
	}
}

/*
2단 ~ 9단 구구단

2*1=2
2*2=4

2*9=18

3*1=3
3*2=6

3*9=27


 */