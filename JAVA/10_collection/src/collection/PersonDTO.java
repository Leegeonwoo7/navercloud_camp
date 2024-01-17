package collection;

//한사람 분량의 데이터
public class PersonDTO {
	private String name;
	private int age;
	
	public PersonDTO() {}
	
	public PersonDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "\t" + age;
	}
}
