package interview;

public class AbstractionChild extends Abstraction {

	public static void main(String[] args) {
		Abstraction ab=new AbstractionChild();
			ab.first();
			Abstraction.first(40);
//			Child ch=new Child();
//			ch.first();
	}
	//@Override
	 void first() {
		System.out.println("I am Overriding abstraction class outside package");
	}

}
