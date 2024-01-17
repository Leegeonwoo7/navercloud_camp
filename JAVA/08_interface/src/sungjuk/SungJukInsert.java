package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk{
	
	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner sc = new Scanner(System.in);
		SungJukDTO std = new SungJukDTO();
		
		System.out.print("번호 입력: ");
		std.setNo(sc.nextInt());
		
		System.out.print("이름 입력: ");
		std.setName(sc.next());
		
		System.out.print("국어 입력: ");
		int kor = sc.nextInt();
		std.setKor(kor);
		
		System.out.print("영어 입력: ");
		int eng = sc.nextInt();
		std.setEng(eng);
		
		System.out.print("수학 입력: ");
		int math = sc.nextInt();
		std.setMath(math);
		
		int tot = kor + eng + math;
		std.setTot(tot);
		std.setAvg(tot / 3.0);
		
		list.add(std);
		System.out.println("입력되었습니다.");
	}

}
