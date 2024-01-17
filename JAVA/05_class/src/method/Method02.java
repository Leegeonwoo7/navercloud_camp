package method;

public class Method02 {
	public static void main(String[] args) {
		Method02 m = new Method02();
		System.out.println("합=" + m.sum(25, 30));
		System.out.println("차=" + m.sub(25, 30));
		System.out.println("곱=" + m.mul(25, 30));
		System.out.println("몫=" + m.div(25, 30));
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	
	public String div(int a, int b) {
		return String.format("%.2f", (double)a / b);
	}
}
