package class_;

class Person {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setData() {
		
	}
}

public class PersonMain {
	public static void main(String[] args) {
		Person lee = new Person();
		System.out.println("객체 lee = " + lee);
		
		lee.setName("이건우");
		lee.setAge(25);
		
		System.out.println(lee.getName());
		System.out.println(lee.getAge());
		System.out.println();
		
		Person kim = new Person();
		System.out.println("객체 kim = " + kim);
		
		kim.setName("김현성");
		kim.setAge(14);
		System.out.println(kim.getName());
		System.out.println(kim.getAge());
		System.out.println();
		
		Person park = new Person();
		park.setData("박명수", 30);
		System.out.println(park.getName());
		System.out.println(park.getAge());
		System.out.println();
		
		Person kang = new Person();
		kang.setData();
		System.out.println(kang.getName());
		System.out.println(kang.getAge());
	}
}
