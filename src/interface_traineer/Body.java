package interface_traineer;

public interface Body {
	public void colour();
	public void interior();
	default void dec() {
		System.out.println("default method in interface");
	}

}
