package homework;

import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = 0;
		
		while(true) {
			System.out.println("구매하실 금액을 입력해주세요: (1,000원 단위)");
			amount = sc.nextInt();
			if(amount % 1_000 == 0) {
				break;
			}
		}
		
		for(int count=0; count<(amount/1000); count++) {
			int[] lotto = new int[6];
			
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45+1);
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
					 	i--;
						break;
					}
				}
			} //중복을 제외한 로또 배열 생성
			
			for(int i=0; i<lotto.length-1; i++) {
				for(int j=i+1; j<lotto.length; j++) {
					if(lotto[i] > lotto[j]) {
						int tmp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = tmp;
					}
				}
			} //선택정렬로 오름차순
			
			
			for(int i=0;i<lotto.length; i++) { //출력
				System.out.print(String.format("%4d", lotto[i]));	
			}
			System.out.println();
			if((count+1) % 5 == 0) { //count는 0부터시작 0도 %5 =true
				System.out.println();
			} //5묶음으로 발행 (줄변환)
		}
	}
}

/*
[문제] 로또 프로그램
1~45 사이의 난수를 6개 발생한다. [O]
단, 숫자는 중복이 되어서는 안된다. [O]
1줄당 금액이 천원이다. []
오름차순으로 모든 줄 정렬  []

[실행결과]
현금 입력 : 3000
    2    4   19   39   43   44
   22   26   33   38   39   42
    5    6    8   25   35   45
    
현금 입력 : 7000    
   2    4   19   39   43   44
   22   26   33   38   39   42
    5    6    8   25   35   45
    3   14   23   30   34   35
   18   20   25   27   32   37

    1   16   32   34   41   42
    5    6   18   30   33   44
*/
