package class_;

public class SungJukMain2 {
	public static void main(String[] args) {
		SungJuk[] arr = new SungJuk[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new SungJuk();
		}

		arr[0].setData("이순신", 46, 45, 89);
		arr[1].setData("라이언", 76, 95, 70);
		arr[2].setData("프로도", 96, 85, 95);
		
		arr[0].printHeader();
		for(SungJuk data : arr) {
			data.calc();
			data.printInfo();
		}
		
//		arr[0].printHeader();
//		for(int i=0; i<arr.length; i++) {
//			arr[i].calc();
//			arr[i].printInfo();
//		}
	}
}
