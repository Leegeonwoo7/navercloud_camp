package homework;

public class FruitMain {
	public static void main(String[] args) {
		Fruit[] fruits = new Fruit[3];
		
		fruits[0] = new Fruit("사과", 100, 80, 75);
		fruits[1] = new Fruit("포도", 30, 25, 10);
		fruits[2] = new Fruit("딸기", 25, 30, 90);

		System.out.println("------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("------------------------------------");
		for(int i=0; i<fruits.length; i++) {
			fruits[i].display();
		}
		Fruit.output();

	}
}