package abstract_;

public class AbstarctMain extends AbstractTest{
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		AbstractTest at = new AbstarctMain();
		at.setName("홍길동");
		System.out.println(at.getName());
	}
}
