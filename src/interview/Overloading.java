package interview;

public class Overloading {

	public static void main(String[] args) {
		
		Fruit.apple();
		Fruit.apple("I am green apple");
		Vegetable.apple(100);
		Vegetable.carrot();

	}

}
class Fruit{
	public static void apple() {
		System.out.println("I am an apple");
	}
	public static void apple(String s) {
		//s="I am green apple";
		System.out.println(s);
	}
}

class Vegetable{
	public static void carrot() {
		System.out.println("This is carrot");
	}
	public static void apple(int a) {
		//a=100;
		System.out.println("Apple 1Kg: "+a);
	}
}