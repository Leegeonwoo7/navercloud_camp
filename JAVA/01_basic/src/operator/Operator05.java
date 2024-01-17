package operator;

public class Operator05 {
	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a);
		System.out.println("!a = " + !a);
		System.out.println();
		
		String b = "apple";
		String c = new String("apple");
		
		System.out.println("b == c : " + (b == c ? "참" : "거짓")); //주소 비교
		System.out.println("b.equals(c) : " + (b.equals(c) ? "참" : "거짓"));
		System.out.println("b != c : " + (b != c ? "참" : "거짓")); //주소 비교
		System.out.println("!b.equals(c) : " + (!b.equals(c) ? "참" : "거짓"));
		
	}
}
