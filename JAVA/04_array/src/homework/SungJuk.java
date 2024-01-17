package homework;

import java.util.Scanner;

public class SungJuk {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		
		System.out.print("인원수 입력: ");
		count = sc.nextInt();
		
		String[] name = new String[count];
		int subjectCount;
		String[][] subject = new String[count][];
		int[][] score = new int[count][];
		double[] avg = new double[count];
		
		for(int i=0; i<name.length; i++) {
			System.out.print("이름 입력:");
			name[i] = sc.next();
			
			System.out.println("과목수 입력: ");
			subjectCount = sc.nextInt();
			//int[][] score = new int[subjectCount][];
			
			subject[i] = new String[subjectCount];
			for(int j=0; j<subjectCount; j++) {
				System.out.print("과목명 입력: ");
				subject[i][j] = sc.next();
			}
			
			score[i] = new int[subjectCount+1];
			for(int j=0; j<subjectCount; j++) {
				System.out.print(subject[i][j] + "점수 입력: ");
				score[i][j] = sc.nextInt();
				
				score[i][subjectCount] += score[i][j];
			}
			
			avg[i] = (double)score[i][subjectCount] / subjectCount;
		}
		
		System.out.println();
		for(int i=0; i<count; i++) {
			System.out.print("이름\t" );
			for(int j=0; j<subject[i].length; j++) {
				System.out.print(subject[i][j] + "\t");	
			}
			System.out.println("총점\t평균");
			
			System.out.print(name[i] + "\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(avg[i]);
			System.out.println();
		}
	}
}