package class2;

import java.util.Scanner;

public class StringBufferMain {
	private int dan;

	public StringBufferMain() {		
		Scanner sc = new Scanner(System.in);	
		System.out.println("원하는 단을 입력:");
		dan = sc.nextInt();
	}
	
	public void display() {
		StringBuffer buffer = new StringBuffer();
		for(int i=1; i<=9; i++) {
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan * i);
			System.out.println(buffer.toString());
			buffer.delete(0, buffer.length());
			//System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	public static void main(String[] args) {
		StringBufferMain sb = new StringBufferMain();
		sb.display();
	}
}
