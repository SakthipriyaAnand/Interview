package interface_traineer;

public class Car implements Engine,Body {
	public static final int B=12;
	public void colour(){
		System.out.println("Blue");
		System.out.println();
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
		System.out.println(Body.B);
		//System.out.println(obj.b);
		//System.out.println(obj.B++);
		
		//public static final int B=12;

	}
	@Override
	public void design() {
		System.out.println("abstract method");
		
	}

}
