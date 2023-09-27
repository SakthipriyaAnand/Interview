package encapsulation_1;

public class MainClass {

	public static void main(String[] args) {
		Encap_acc_show en= new Encap_acc_show();
		en.showdata("Sakthi", "Shimakh", 12, "Testing");
		System.out.println("Name: "+en.acceptname());
		System.out.println("Company: "+en.acceptcompany());
		System.out.println("Id: "+en.acceptid());
		System.out.println("Department: "+en.acceptdepartment());
	}

}
