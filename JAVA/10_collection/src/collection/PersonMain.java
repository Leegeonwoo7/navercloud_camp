package collection;

import java.util.ArrayList;

public class PersonMain {
	
	public ArrayList<PersonDTO> init() { //지역객체
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("라이언", 30);
		ArrayList<PersonDTO> list = new ArrayList<>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
	
		return list; //aa,bb,cc의 객체가아닌 ArrayList의 주소를 반환
	}
	public static void main(String[] args) {
		PersonMain personMain = new PersonMain();
		
		ArrayList<PersonDTO> list = personMain.init();
		System.out.println(list); 
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName() + "\t" + list.get(i).getAge());
		}
		System.out.println();
		
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO.getName() + "\t" + personDTO.getAge());
		} //for each가 훨씬 더 간결함
		System.out.println();
		
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}//Override를 통해 더 간결해짐
	}
}
