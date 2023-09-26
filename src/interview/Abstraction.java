package interview;

public abstract class Abstraction {
	abstract  void first() ; //abstraction method
	
	static void first(int a) {  //creating method for the abstraction using same method name
		
		System.out.println("I am a concrete method\na="+a);
	}
	protected void sec() { 		// protected is achived using abstract it is not achieved in interface
		System.out.println("protected in abstract");
	}
	@SuppressWarnings("unused")
	private void se(){		// private is achived using abstract it is not achieved in interface
		System.out.println("private in abstract");
	}
//	public static void main(String[] args) {
//		
//		Abstraction.first(1);
//		//Child c=new Child();
//		Child ch=new Child();
//		ch.first();
//
//		
//	}
//
//}
// class Child extends Abstraction{
//	@Override
//	 void first() {
//		System.out.println("I am Overridede abstraction class inside package");
//		
//	}
}
