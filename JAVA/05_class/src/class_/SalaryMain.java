package class_;

public class SalaryMain {
	public static void main(String[] args) {
		SalaryDTO[] salaryArr = new SalaryDTO[3];
		
		for(int i=0; i<salaryArr.length; i++) {
			salaryArr[i] = new SalaryDTO();
		} 
		
		salaryArr[0].setData("홍길동", "이사", 4800000, 300000);
		salaryArr[1].setData("송중기", "사원", 2000000, 100000);
		salaryArr[2].setData("아이유", "주임", 2900000, 150000);
		
		System.out.println("이름\t직급\t기본급\t\t수당\t합계\t\t세금\t월급");
		for(int i=0; i<salaryArr.length; i++) {
			salaryArr[i].calc();
			salaryArr[i].printInfo();
		}
	}
}
