package super_key;

public class Dog implements Animal {
	String s="Dog";   // in interface class super is not accepting
	@Override
	public void sleep() {
		System.out.println("Animal sleep");
		//eat();
		//System.out.println(this.s); 
		
	}
	public void eat() {
		System.out.println("Dog eats...");
		//sleep();
		//Animal.super.eat();
		//System.out.println(this.s); 
		
	}
	public void sleep(String dog) {
		System.out.println("Dog "+dog);
		//super.eat();
		Animal.super.eat();
		this.eat();
		this.sleep();
		//System.out.println(this.s); //takes variable from Animal if variable s is not declared in child 
		System.out.println(this.s);
		
	}

}
