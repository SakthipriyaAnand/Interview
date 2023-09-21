package interview;

public class Interface implements MyInter  {

	public static void main(String[] args) {
		Interface in=new Interface();
		in.method1();
		in.method3();
//		MyInter mi=new Interface();  //object can create like this also both are same
//		mi.method1();
//		mi.method3();
		MyInter.method2();
	}
	@Override // if we comment line 10-13 it will show error
	public void method1() {
		System.out.println("Interface override");
	}
	public void method3() {
		System.out.println("method 3");
	}

}
