package method;

public class Method01 {
	public static void main(String[] args) {
		Method01 method = new Method01();
		method.display();
		Method01.output();
	}
	
	public void display() {
		System.out.println("method");
	}
	
	public static void output() {
		System.out.println("static method");
	}
}
