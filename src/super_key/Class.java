package super_key;

public class Class {
	
	Class(){
		System.out.println("constructor in parent class");
	}
	int a=12;
	public void class1() {
		System.out.println("class1 in parent class");
	}
	
	public void class2() {
		System.out.println("class2 in parent class");
	}
}

class Class2 extends Class {
	int a=11;
	public void Class1() {
		
		System.out.println("class1 in child class");
		//getClass();
	}
	
	public void class3() {
		System.out.println("class3 in child class");
		super.class1();		//from parent class
		super.class2();		//from parent class
		this.Class1();		//from same class
		//System.out.println(super.a);//variable in parent class
		System.out.println(a);//variable inside the class
		
		//this.class1();
		//this.class2();
		//this.class3();
	
	}
}
