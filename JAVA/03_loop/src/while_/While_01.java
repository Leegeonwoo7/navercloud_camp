package while_;

public class While_01 {
	public static void main(String[] args) {
		int i = 1;
		while(i<=10) {
			System.out.print(i + "  ");
			i++;
		}
		System.out.println();
		
		int j = 0;
		while(j<10) {
			j++;
			System.out.print(j + "  ");
		}
		System.out.println();
		
		int k=0;
		while(true) {
			k++;
			System.out.print(k + "  ");
			if(k==10) {
				break;
			}
		}
	}
}
