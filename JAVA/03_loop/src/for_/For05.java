package for_;

import java.io.IOException;
//제곱 구하는 법
public class For05 {
	public static void main(String[] args) throws IOException {
		System.out.print("X : ");
		int x = System.in.read() - '0';
		System.in.read();
		System.in.read();
		System.out.print("Y : ");
		int y = System.in.read() - '0';
		
		int result = 1;
		for(int i=1; i<=y; i++) {
			result *= x;
		}
		System.out.println(x + "의 " + y + "승: " + result);
	}
}


/*
[문제] x의 y승을 구하시오 (for)

[실행결과]
x : 2
y : 5
2의 5승 xx
*/