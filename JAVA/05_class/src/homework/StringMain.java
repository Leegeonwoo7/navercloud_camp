package homework;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("문자열 입력: ");
        String inputStr = sc.next();
        System.out.print("현재 문자열 입력: ");
        String targetStr = sc.next();
        System.out.print("바꿀 문자열 입력: ");
        String changeStr = sc.next();
        
        if(inputStr.length() < targetStr.length()) {
        	System.out.println("입력한 문자열의 크기가 작습니다");
        }else {
        	int index = 0;
        	int count = 0;
        	
        	while((index=inputStr.indexOf(targetStr, index)) != -1) {
        		index += targetStr.length();
        		count++;
        	}
        	System.out.println(inputStr.replace(targetStr, changeStr));
        	System.out.println(count + "개 치환");
        }
    }
}

/* 별로 치환하여 카운트하고 문제풀기
public class StringMain {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        System.out.print("문자열 입력 : ");
        String input = bf.readLine().toLowerCase();

        System.out.print("현재 문자열 입력 : ");
        String input1 = bf.readLine();

        System.out.print("바꿀 문자열 입력 : ");
        String input2 = bf.readLine();


        System.out.println();
        if (input1.length() > input.length()) {
            System.out.println("입력한 문자열의 크기가 작습니다. ");
        }

        input = input.replace(input1, "*");

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '*') {
                cnt++;
            }
        }
        input = input.replace("*", input2);

        if (cnt != 0) {
            System.out.println(input);
            System.out.println(cnt + "번 치환");
        } else {
            System.out.println("치환 할 수 없습니다.");
        }
    }
}
*/