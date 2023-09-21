package interfaceExample;

public interface Interface2 extends Interface1{
	public void orange();
	public static void orange(String range) {
		System.out.println("orange 1kg= "+range);
	}
	default void orange(int value) {
		System.out.println("orange: "+value);
	}
}
