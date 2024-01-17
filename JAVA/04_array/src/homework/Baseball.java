package homework;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer;
		
		do {
			System.out.println("게임을 실행하시겠습니까(Y/N): ");
			answer = sc.next();
			} while(!answer.equalsIgnoreCase("Y") && (!answer.equalsIgnoreCase("N")));
		
		if(answer.equalsIgnoreCase("Y")) {
			System.out.println("게임을 시작합니다.");
		}
		
		int[] computer = new int[3];
		int[] user = new int[3];
		
		for(int i=0; i<computer.length; i++) {
			int random = (int)(Math.random()* 9) + 1;
			computer[i] = random;
			for(int j=0; j<i; j++) {
				if(computer[j] == computer[i]) {
					i--;
					break;
				}
			}
		} //컴퓨터 값 설정, 중복제거
		
		for(int i=0; i<computer.length; i++) {
			System.out.print(computer[i]); //
		}System.out.println();
		
		while(true) {
			int strikeCount = 0;
			int ballCount = 0;
			
			System.out.println("숫자 세 개를 입력하세요: ");
			int input = sc.nextInt();
			int num = 100;
			
			for(int i=0; i<user.length; i++) {
				user[i] = input / num;
				input %= num;
				num /= 10;
			} //입력값을 배열로 변환하여 저장
			  //System.in.read() - 한글자씩 입력받음
	
			
			
			for(int i=0; i<computer.length; i++) {
				if(computer[i] == user[i]) {
					strikeCount++;
				}
				for(int j=0; j<user.length; j++) {
					if(!(computer[i] == user[i]) && computer[i] == user[j]) {
						ballCount++;
					}
				}
			}
			System.out.println(strikeCount + "스트라이크 " + ballCount + "볼");
			
			if(strikeCount == 3) {
				System.out.println("정답입니다. 게임종료");
				break;
			} //비교
		}
	}

}
/*
[문제] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼

프로그램을 종료합니다.
*/