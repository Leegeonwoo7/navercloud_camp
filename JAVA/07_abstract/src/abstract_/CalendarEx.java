package abstract_;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx {
	private int year;
	private int month;
	private int firstDay;
	private int lastDayOfMonth;
	
	public CalendarEx() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		this.year = sc.nextInt();
		
		System.out.print("월 입력 : ");
		this.month = sc.nextInt();
	}
	
	public void calc() {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1); //month는 0~11이므로 사용자의 값으로부터 -1
		
		firstDay = cal.get(cal.DAY_OF_WEEK);
		lastDayOfMonth = cal.getActualMaximum(cal.DAY_OF_MONTH);
				
		display(firstDay, lastDayOfMonth);
	}
	
	public void display(int firstDay, int lastDay) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i=1; i<firstDay; i++) { //처음 시작일까지의 공백 tip: 요일은 1부터시작
			System.out.print("\t");
		}
		
		for(int day=1; day<=lastDay; day++) { 
			System.out.print(day + "\t");
			
			if(firstDay % 7 ==0)System.out.println();
			firstDay++;
		}
//		if((day + firstDay -1) % 7 == 0) {
//			System.out.println();
//		}
	}
}
