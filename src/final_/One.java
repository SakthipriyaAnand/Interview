package final_;

public class One {
	public static final int A=10; // final variables should be in capital letter and public static
	
	
	
public void w(){
	
	System.out.println(A);
	//System.out.println(this.a++); //it is not possible because final variable can't be change
}

final void w1() {
	System.out.println(A);
}

}
//  final class Two{
//	public void r() {
//		System.out.println("final class");
//	}
//}