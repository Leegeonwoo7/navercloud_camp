package multi;

public class MultiArray04 {
	public static void main(String[] args) {
		String[] name = {"홍길동","프로도","라이언"};
		int[][] score = {{90, 95, 100, 0},{100, 89, 75, 0},{75, 80, 48, 0}};
		double[] avg = new double[3];
		char[] grade = new char[3];
		int sum;
		
		for(int i=0; i<score.length; i++) {
			sum = 0;
			for(int j=0; j<score[i].length; j++) {
				sum+=score[i][j];	
			}
			score[i][score.length] = sum;
			avg[i] = (double)sum / 3;
			
			if(avg[i] >= 90)	grade[i] = 'A';
			else if(avg[i] >= 80) grade[i] = 'B';
			else if(avg[i] >= 70) grade[i] = 'C';
			else if(avg[i] >= 60) grade[i] = 'D';
			else grade[i] = 'F';
		}
		
		
		System.out.println("----------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("----------------------------------------------------");
		for(int i=0; i<3; i++) {
			System.out.print(name[i]+"\t");
			for(int j=0; j<4; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(String.format("%.1f", avg[i]) + "\t" + grade[i]);
		}
	}
}

/*
----------------------------------------------------
이름		국어		영어		수학		총점		평균		학점
----------------------------------------------------
홍길동	90		95		100
프로도	100		89		75
라이언	75		80		48
----------------------------------------------------
*/