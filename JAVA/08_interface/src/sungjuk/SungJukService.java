package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	SungJuk sungJuk = null;
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메뉴 번호를 입력하세요 : ");
		while(true) {
			System.out.println();
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 삭제");
			System.out.println("5. 정렬");
			System.out.println("6. 종료");
			int menu = sc.nextInt();
			
			if(menu == 6) break;
			if(menu == 1) {
				sungJuk = new SungJukInsert();
			}else if(menu == 2) {
				sungJuk = new SungJukPrint();
			}else if(menu == 3) {
				sungJuk = new SungJukUpdate();
			}else if(menu == 4) {
				sungJuk = new SungJukDelete();
			}else if(menu == 5) {
				sungJuk = new SungJukSort();
			}else continue;
			sungJuk.execute(list);
		}
	}
}
