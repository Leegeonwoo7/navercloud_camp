package inheritance;

class Test{
	@Override
	public String toString() {
	return getClass() + "@개바부" ;
	}
}

public class ObjectMain {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t);
		
		System.out.println("객체 t = " + t.toString());
		System.out.println("객체 t = " + t.hashCode());
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str = " + str);
		System.out.println("객체 str = " + str.toString());
		System.out.println("객체 str = " + str.hashCode());
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println(aa == bb); // 참조값 비교
		System.out.println(aa.equals(bb)); //문자열 비교
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : " + (ee==ff));
		System.out.println("ee.equals(ff) : " + ee.equals(ff));
	}
}
