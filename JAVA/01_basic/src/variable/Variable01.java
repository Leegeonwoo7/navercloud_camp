package variable;

public class Variable01 {
	public static void main(String[] args) {
		boolean a;
		a = false;
		System.out.println("a = " + a);
		
		char b;
		b = 'A';
		System.out.println("b = " + b);
		
		char c;
		c = 65;
		System.out.println("c = " + c);
		
		int d;
		d = 65;
		System.out.println("d = " + d);
		
		int e;
		e = 'A';
		System.out.println("e = " + e );
		
		long f;
		f = 25L; //25L or 25l, Long타입의 상수
		System.out.println("f = " + f);
		
		float g;
		//g = 43.8; //Java 실수형 기본값은 double타입이기때문에 접미사를 붙혀주어야함.
		g = 43.8f;
		g = (float)43.8;
		System.out.println("g = " + g);
	}
}
