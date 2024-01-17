package class_;

import java.text.DecimalFormat;

public class SalaryDTO {
	private String name;
	private String job;
	private int basic;
	private int extra;
	private int total;
	private double tax;
	private int salary;
	
	public void setData(String name, String job, int basic, int extra) {
		this.name = name;
		this.job = job;
		this.basic = basic;
		this.extra = extra;
	}
	
	public void calc() {
		total = basic + extra;
		if(total >= 5_000_000) {
			tax = total * 0.03;
		}else if(total >= 3_000_000) {
			tax = total * 0.02;
		}else {
			tax = total * 0.02;
		}		
		salary = (int)(total - tax);
	} 
	public void printInfo() {
		DecimalFormat df = new DecimalFormat();
		System.out.println(name + "\t" + 
							job + "\t" + 
							df.format(basic) + "\t" + 
							df.format(extra) + "\t" + 
							df.format(total) + "\t" + 
							df.format(tax) + "\t" + 
							df.format(salary));	
	}
}
