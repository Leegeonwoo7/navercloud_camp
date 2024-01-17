package method;

public class Method03 {
	public static void main(String[] args) {
		Method03 m = new Method03();
		
		System.out.println("합 = " + m.sum(10,20));
		System.out.println("합 = " + m.sum(10,20,30));
		System.out.println("합 = " + m.sum(10,20,30,40));
	}
	
	public int sum(int...ar) {
		int sum =0;
		for(int i=0; i<ar.length; i++) {
			sum+=ar[i];
		}
		return sum;
	}
	
	/*
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return sum(a,b)+c;
	}
	
	public int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	*/
}
