package inheritance;

enum Color{
	RED, GREEN, BLUE;
}


//-------------
class Final {
	public final String FRUIT = "사과";
	public final String FRUIT2;
	
	public static final String ANIMAL = "호랑이";
	public static final String ANIMAL2;
	
	public static final int RED = 0;
	public static final int GREEN = 1;
	public static final int BLUE = 2;
	
	static {
		ANIMAL2 = "기린";
	}
	
	public Final() {
		FRUIT2 = "딸기";
	}
}

public class FinalMain {
	public static void main(String[] args) {
		final int AGE = 26;
		//AGE++ ->ERROR
		
		System.out.println(AGE);
		
		final String NAME;
		NAME = "홍길동";
		System.out.println(NAME);
		System.out.println();
		
		Final f = new Final();
		
		System.out.println(f.FRUIT);
		System.out.println(f.FRUIT2);
		System.out.println();
		
		System.out.println(Final.ANIMAL);
		System.out.println(Final.ANIMAL2);
		
		System.out.println("빨강 : " + Color.RED);
		
		for(Color tmp : Color.values()) {
			System.out.print(tmp + " ");
		}
	}
}
