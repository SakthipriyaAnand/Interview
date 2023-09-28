package super_key;

public interface Animal {
	
	public String s= "animal";
	public void sleep() ;  //
	default void eat() {
		System.out.println("Animal Eat");
		
	}

}
