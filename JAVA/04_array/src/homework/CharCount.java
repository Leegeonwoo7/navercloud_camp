package homework;

public class CharCount {
	public static void main(String[] args) {
		char[] arr = new char[50];
		int[] countArr = new int[26];
		
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random() * 26 )+ 65;
			arr[i] = (char)random;
		} //난수로 배열 셋팅
		
		
		for(int i=0; i<arr.length; i++) {
			countArr[arr[i]-'A']++;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			if((i+1) % 10 == 0) {
				System.out.println();
			}
		}//10개의 문자씩 출력
		System.out.println();
		
		for(int i=0; i<countArr.length; i++) {
			System.out.println((char)(i + 65) + " : " + countArr[i]);
		}
	}
}

/*
[문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
- 1줄에 10개씩 출력
- A의 개수? B의 개수? C의 개수? ~~~ Z의 개수 ?

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
Z : 0
*/