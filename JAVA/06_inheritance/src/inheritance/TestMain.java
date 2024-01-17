package inheritance;

class AA {
	public int a = 3;
	
	public void disp() {
		a += 5;
		System.out.println("AA : " + a + " ");
	}
}

class BB extends AA {
	public int a = 8;
	
	public void disp() {
		this.a += 5;
		System.out.println("BB : " + a + " ");
	}
}


public class TestMain {
	public static void main(String[] args) {
		//BB타입의 aa변수에 BB인스턴스를 저장
		BB aa = new BB(); //override되면 메서드는 반드시 자식의 것 사용
		aa.disp();
		System.out.println("aa : " + aa.a);
		System.out.println();
		
		//AA타입의 bb변수에 BB인스턴스를 저장
		AA bb = new BB();
		bb.disp();
		System.out.println("bb : " + bb.a);
		System.out.println();
		
		//BB타입의 cc변수에 
		BB cc = (BB)bb; //부모타입을 자식타입으로 형변환
		
		cc.disp();
		System.out.println("cc: " + cc.a);
		System.out.println();
		
		AA dd = new AA();
		dd.disp();
		System.out.println("dd : " + dd.a);
		System.out.println();
		
		//BB ee = (BB)dd; //에러
		//ee.disp();
		
		
	}
}
