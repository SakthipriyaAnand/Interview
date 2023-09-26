package interface_traineer;

public interface Body {
	public int a=1;			//variables in interface class
	static String s="Hello";
	final int b=2;
	//private int c=3;		//only static, public and final are permitted in interface
	//protected void add(); // not accepted in interface
	abstract void design();
	public void colour();
	public void interior();
	default void dec() {
		System.out.println("default method in interface");
	}

}
