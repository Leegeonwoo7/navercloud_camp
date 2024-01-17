package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;


public class NumberMain {
	public static void main(String[] args) {
		//NumberFormat nf = new NumberFormat(); 추상클래스이므로 에러
		NumberFormat nf = new DecimalFormat(); //부모 = 자식
		
		//소수는 3째자리까지
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		//유효숫자가 아닌 것은 표현하지 않는다.
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		NumberFormat nf4 = NumberFormat.getInstance(); //메서드로 인스턴스를 생성
		nf4.setMaximumFractionDigits(2);//소수이하 2째자리로 설정
		nf4.setMinimumFractionDigits(2);//0을 강제로 표시
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		//NumberFormat nf5 = NumberFormat.getInstance(Locale.US); //메서드로 인스턴스를 생성
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US);
		nf5.setMaximumFractionDigits(2);//소수이하 2째자리로 설정
		nf5.setMinimumFractionDigits(2);//0을 강제로 표시
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
	}
}
