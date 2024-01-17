package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Today {
	public static void main(String[] args) throws ParseException {
		Date date = new Date(); 
		System.out.println("오늘 날짜: " + date);
		System.out.println();
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜: " + sdf.format(date));
		System.out.println();
		
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19980712221415");
		System.out.println("내 생일 : " + birth);
		System.out.println("내 생일 : " + sdf.format(birth));
		System.out.println();
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get((Calendar.MONTH+1));
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분 " + second + "초");
		
		int week = cal.get(cal.DAY_OF_WEEK);
		String dayOfWeek = null;
		switch(week){
		case 1 : dayOfWeek = "일요일"; break;
		case 2 : dayOfWeek = "월요일"; break;
		case 3 : dayOfWeek = "화요일"; break;
		case 4 : dayOfWeek = "수요일"; break;
		case 5 : dayOfWeek = "목요일"; break;
		case 6 : dayOfWeek = "금요일"; break;
		case 7 : dayOfWeek = "토요일"; break;
		}
		System.out.println(dayOfWeek);	
		}		
	}

