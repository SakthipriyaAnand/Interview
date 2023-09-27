package final_;

public class Main_method extends One{
//final void w1() {		
//	System.out.println("hello");//overriding is not possible in final method
//	System.out.println(A);
//}

	public static final int A=33;
	public static void main(String[] args) {
		One o= new One();
		o.w();
		o.w1();
		
//		Two t=new Two();
//		t.r();
//		Main_method mm= new Main_method();
//		System.out.println(mm.A);
		//mm.w1();
	}

}
