package operator;

public class Operator04 {
	public static void main(String[] args) {
		int num1 = 0, num2 =0;
		boolean result;
		
		result = ( (num1 += 10) < 0 && (num2 += 10) > 0 ); //&&연산의 뒷 부분은 실행하지 않음, &일 경우 뒤까지 실행
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + "num2 = " + num2);
		System.out.println();
		
		result = ( (num1 += 10) > 0 || (num2 += 10) > 0 );
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + "num2 = " + num2);
	}
}
