package multi;

public class Test {
	public static void main(String[] args) {
		int arr[] = new int[4];
		int num = 1234;
		
		int tmp = 1000;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = num / tmp;
			num %= tmp;
			tmp /= 10;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

/*
[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

[출력]
이름     국어	  영어   총점     평균
홍길동    95	  100   xxx	  xx.xx

이름		국어  영어   과학    총점      평균
이기자	95   100   90	 xxx      xx.xx
*/