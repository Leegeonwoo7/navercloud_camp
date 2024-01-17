package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 입력: ");
		int updateNum = sc.nextInt();
		
		boolean hasNumber = false;
		for(SungJukDTO data : list) {
			if(data.getNo() == updateNum) {
				hasNumber = true;
				break;
			}
		}
		
		if(!hasNumber) {
			System.out.println("해당하는 번호가 없습니다.");
			return;
		}
		
		
		System.out.print("수정 할 이름 입력: ");
		String updateName = sc.next();
		
		System.out.print("수정 할 국어점수 입력: ");
		int updateKor = sc.nextInt();
		
		System.out.print("수정 할 영어점수 입력: ");
		int updateEng = sc.nextInt();
		
		System.out.print("수정 할 수학점수 입력: ");
		int updateMath = sc.nextInt();
		
		SungJukDTO updateDTO = list.get(updateNum-1);
		updateDTO.setName(updateName);
		updateDTO.setKor(updateKor);
		updateDTO.setEng(updateEng);
		updateDTO.setMath(updateMath);
		updateDTO.setTot(updateKor + updateEng + updateMath);
		updateDTO.setAvg(updateDTO.getTot() / 3.0);
	}

}
