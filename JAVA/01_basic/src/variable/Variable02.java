package variable;

public class Variable02 {
	int a; //필드, 인스턴스 변수
	static int b; //필드, 클래스 변수
	static double c;
	static String str; //필드  
	
	public static void main(String[] args) {
		int a = 100;//local variable
		System.out.println("지역변수 a = " + a);
		System.out.println();
		
		System.out.println("필드 a = " + new Variable02().a);
		System.out.println("필드 b = " + b);
		System.out.println("필드 c = " + c);
		System.out.println("필드 str = " + str);
	}
}
