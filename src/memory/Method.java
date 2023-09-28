package memory;

public class Method {
  static int a=0;
	//int a=0;		//creating multiple memory for each object creation
  int b=2;//for static there is only one memory allocated so if we create multiple obj 
 				//the value is incremented as per this prog
 Method(int b){
	 //Method(){
	 //this.a++;
	 this.a=this.a+b;
	 //this.b++;
	 System.out.println(a);
	 //System.out.println("a="+a+" b="+b);
 }
// public void add() {
//		a=a+1;
//		a=b+2;
//		 System.out.println(a);
// }
 public void add() {
	this.a=this.a+1;
	 this.a=this.a+2;
	 System.out.println(a);
 }
 public void mul() {
	this.a=this.a+1;
	 this.a=b*2;
	 System.out.println(a);
 }
}
