package while_;

import java.io.IOException;
import java.util.Scanner;

public class Game {
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int count;
		
		while(true) {
			count = 0;
			int computer = (int)(Math.random() * 100 + 1) ;
			System.out.println(computer);
			System.out.println("1 ~ 100사이의 숫자를 맞추세요");
			
				while(true) {
					System.out.print("숫자 입력 : ");
					int num = sc.nextInt();
					count++;
					
					if(num > computer) {
						System.out.println(num + "보다 작은 숫자입니다.");
					}else if(num < computer) {
						System.out.println(num + "보다 큰 숫자입니다.");
					}
					else if(num == computer) {
						System.out.println("정답입니다. 시도 횟수는 " + count+ "입니다.");
						break;
					}	
				}
			System.out.print("게임을 다시 진행하시겠습니까?(Y/N) : " );
			String YorN = sc.next();
			if(YorN.equalsIgnoreCase("N")) {
				break;
			}
		}
	}
}

/*
[문제] 숫자 맞추기 게임
- 컴퓨터가 1 ~ 100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임
- 몇 번만에 맟주었는지 출력한다.

[실행결과]
1 ~ 100사이의 숫자를 맞추세요 (77)

숫자 입력 : 50
50보다 큰 숫자입니다
숫자 입력 : 80
80보다 작은 숫자입니다.
~
~
숫자 입력 : 77
딩동뎅...x번만에 맞추셨습니다.
*/
