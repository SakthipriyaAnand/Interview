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
		

	}

}