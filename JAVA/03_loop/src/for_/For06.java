package for_;

import java.util.Scanner;

public class For06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			int result = 1;
			System.out.print("숫자 입력: ");
			input = sc.nextInt();
			if(input == 0) {
				break;
			}else if(input < 0 || input > 10) {
				System.out.println("잘못된 값을 입력하셨습니다. [1~10의 값 입력]");
				continue;
			}
			
			for(int f=1; f<=input; f++) {
				result *= f;
			}
			System.out.println(input + "!" + " = " + result);
		}
	}
}


/*
[문제] 팩토리얼을 구하시오
- 음수가 입력되면 다시 입력을 받는다.  if(input < 0) continue
- 0이 입력되면 프로그램을 종료한다.  if(input == 0) break
- 숫자는 1부터 10까지만 입력한다.  && input > 10 continue

[실행결과]
숫자 입력 : 3
3! = 6 (1 * 2 * 3)

숫자 입력 : -3
숫자 입력 : -5
숫자 입력 : 5
5! = 120

숫자 입력 : 0
프로그램을 종료합니다.
*/