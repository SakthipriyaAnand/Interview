package encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		
		Encap en=new Encap();
		
		en.setage(25);
		en.setname("Anand");
		System.out.println("My name is: "+en.getname());
		System.out.println("My age is: "+en.getage());
		
		Encap.setid(12);
		
		
		Encapsulation_1 en1=new Encapsulation_1();
		en1.setnumber(13);
		en1.setword("sakthi");
		System.out.println("Number: "+en1.getnumber());
		System.out.println("word: "+en1.getword());
		System.out.println(en1.getdig());
		//int val=en1.getdig();
		
		en1.setdig(15);
		System.out.println(en1.getdig());
		en1.setdig1(100);
		System.out.println(en1.getdig1());
		
		Encapsulation_1 en2=new Encapsulation_1();
		en2.setdig1(200);
		System.out.println(en2.getdig1());
		
	}

}
class Encap{
private int age;
private String name;

static int id;
							// get method(used in sysout mainmethod)
public int getage() {
	return age;
}

public String getname() {
	return name;
}
							//set method
public void setage(int inputAge) {
	age=inputAge;
}

public void setname(String inputName) {
	name=inputName;
}
public static void setid(int inputId) {
	id=inputId;
	System.out.println("My Id is: "+id);
}
}
