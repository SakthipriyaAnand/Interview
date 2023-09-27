package interface_traineer;

public interface Body {
	public int a=1;			//variables in interface class
	static String s="Hello";
	//public static final int B=2;
	public static final int B=3;
	//private int c=3;		//only static, public and final are permitted in interface
	//protected void add(); // not accepted in interface
	abstract void design();
	public void colour();
	public void interior();
	default void dec() {
		//System.out.println(this.B++);
		System.out.println("default method in interface");
	}

}
