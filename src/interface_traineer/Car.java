package interface_traineer;

public class Car implements Engine,Body {
	
	public void colour(){
		System.out.println("Blue");
	}
	public void interior(){
		System.out.println("seat colour");
	}
	public void diesel(){
		System.out.println("diesel");
	}
	public void petrol(){
		System.out.println("petrol");
	}
	public static void main(String[] args) {
		Car obj= new Car();
		obj.colour();
		obj.diesel();
		obj.interior();
		obj.petrol();
		obj.dec();
		System.out.println(Body.a);
		System.out.println(Body.s);
		System.out.println(Body.b);
		//System.out.println(obj.b);
		

	}
	@Override
	public void design() {
		System.out.println("abstract method");
		
	}

}
