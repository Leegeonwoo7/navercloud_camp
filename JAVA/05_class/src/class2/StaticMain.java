package class2;

class StaticTest{
	private int a;
	private static int b;
	
	static {
		System.out.println("static 초기화 영역");
		b = 7;
	}
	
	public StaticTest() {
		System.out.println("기본 생성자");
		this.a = 7;
	}
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a = " + a + "\t b = " + StaticTest.b);
	}
	
	public static void output() { // static은 this를 사용할 수 없음
		System.out.println("Static method");
	}
}


public class StaticMain {
	public static void main(String[] args) {
		StaticTest aa = new StaticTest();
		aa.calc();
		aa.disp();
		System.out.println();
		
		StaticTest bb = new StaticTest();
		bb.calc();
		bb.disp();
		System.out.println();
		
		StaticTest cc = new StaticTest();
		cc.calc();
		cc.disp();
		System.out.println();
		
		StaticTest.output();
		aa.output();
	}
}
