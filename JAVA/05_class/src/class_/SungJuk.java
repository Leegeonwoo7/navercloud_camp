package class_;

public class SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	
	public void calc() {
		this.tot = kor + eng + math;
		this.avg = (double)tot / 3;
		if(avg >= 90) this.grade = 'A';
		else if(avg >= 80) this.grade = 'B';
		else if(avg >= 70) this.grade = 'C';
		else if(avg >= 60) this.grade = 'D';
		else this.grade = 'F';
	}
	
	public void setData(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
		
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	

	public int getEng() {
		return eng;
	}
		
	public int getMath() {
		return math;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public int getTot() {
		return tot;
	}
	
	public char getGrade() {
		return grade;
	}
	
	public void printHeader() {
		System.out.println("----------------------------------------------------");
		System.out.println("| 이름\t국어\t영어\t수학\t총점\t평균\t학점 |");
		System.out.println("----------------------------------------------------");
	}
	
	public void printInfo() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.2f", avg) + "\t" + grade);
	}
}
