package interfaceExample;

public class MultipleInterface implements Interface2 {

	public static void main(String[] args) {
		Interface2 i=new MultipleInterface();
		i.banana();
		i.orange();
		i.orange(10);
		Interface2.orange("100");

	}
@Override
public void banana(){
	int a=2,b=2,c;
	c=a*b;
	System.out.println("a="+a+" b="+b+" a*b= "+c);
	System.out.println("Interface 1");
	
}
@Override
public void orange() {
	System.out.println("Interface 2");
}
}

