package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukDelete implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner sc = new Scanner(System.in);
		SungJukDTO delDTO = null;
		int count = 0;
		
		if(list.size() == 0) {
			System.out.println("삭제할 데이터가 없습니다.");
			return;
		}
		
		System.out.print("삭제할 이름 입력: ");
		String delName = sc.next();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(delName)) {
				delDTO = list.get(i);
				list.remove(i);
				count++;
			}
		}
		
		if(delDTO == null) {
			System.out.println(delName + "회원의 정보가 없습니다.");
			return;
		}
		System.out.println(count + "건의 항목을 삭제하였습니다.");
	}
}
