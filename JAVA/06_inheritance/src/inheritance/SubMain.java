package inheritance;

public class SubMain extends Super{
	protected String name;
	protected int age;
	
	public SubMain() {
		System.out.println("Sub 기본 생성자");
	}
	
	public SubMain(String name, int age, double weight, double height) {
		super(weight, height);
		System.out.println("SubMain 생성자");
		this.name = name;
		this.age = age;
//		super.weight = 63.3;
//		super.height = 178;
//		this.weight = weight;
//		this.height = height;
	}
	
	public void ouput() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	
	public static void main(String[] args) {
		SubMain aa = new SubMain("홍길동", 26 , 78, 176.3);
		aa.ouput();
		System.out.println();
		
		Super bb = new SubMain("코난", 13, 45.8, 163);
		bb.disp();
	}
}
