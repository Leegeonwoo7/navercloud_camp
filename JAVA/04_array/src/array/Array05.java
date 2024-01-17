package array;

import java.util.Scanner;

public class Array05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[5];
		
		while(true) {	
			System.out.println("주차장 관리 프로그램");
			System.out.println("*******************");
			System.out.println("\t1. 입차");
			System.out.println("\t2. 출차");
			System.out.println("\t3. 리스트");
			System.out.println("\t4. 종료");
			System.out.println("*******************");
			System.out.print("\t메뉴: ");
			int menu = sc.nextInt();
			
			if(menu == 1) { //case 1
				System.out.print("위치 입력: ");
				int parking = sc.nextInt();
				if(arr[parking-1]) {
					System.out.println("이미 주차되어있습니다.");
				}else {
					arr[parking-1] = !arr[parking-1];
					System.out.println(parking + "위치에 주차합니다.");			
				}
				
			} else if(menu == 2) { //case 2
				System.out.print("위치 입력: ");
				int out = sc.nextInt();
				if(!arr[out-1]) {
					System.out.println("주차되어있지 않습니다.");
				}else {
					arr[out-1] = !arr[out-1];
					System.out.println(out + "위치에서 출차합니다.");
				}
				
			} else if(menu == 3) {
				System.out.println("현재 주차장 정보:  (true-자리없음, false-빈석)"  );
				for(int i=0; i<arr.length; i++) {
					System.out.println((i+1) + "번째 위치: " + arr[i]);
				}
			
			} else if(menu == 4) {
				break;
			}
		}
	}
}
/*
주차장 관리 프로그램
**************
   1. 입차
   2. 출차
   3. 리스트
   4. 종료
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false
*/