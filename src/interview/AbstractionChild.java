package interview;

public class AbstractionChild extends Abstraction {

	public static void main(String[] args) {
		Abstraction ab=new AbstractionChild();
			ab.first();
			Abstraction.first(40);
			//AbstractionChild ne=AbstractionChild();	//not possible
			//Abstraction abc=new Abstraction();
//			Child ch=new Child();
//			ch.first();
	}
	//@Override
	 void first() {
		System.out.println("I am Overriding abstraction class outside package");
	}

}
