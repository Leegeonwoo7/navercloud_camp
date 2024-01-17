package class_;

public class SungJukMain {
	public static void main(String[] args) {
		SungJuk lee = new SungJuk();
		lee.setData("이순신", 76, 65, 100);
		lee.calc();
		lee.printHeader();
		lee.printInfo();
		
		SungJuk kim = new SungJuk();
		kim.setData("김유신", 84, 45, 98);
		kim.calc();
		kim.printInfo();
		
		SungJuk park = new SungJuk();
		park.setData("박신영", 54, 85, 48);
		park.calc();
		park.printInfo();
	}
}
