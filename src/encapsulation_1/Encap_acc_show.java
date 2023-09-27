package encapsulation_1;

public class Encap_acc_show {

	private String name;
	private String company;
	private int id;
	private String department;
	
	public void showdata(String name, String company, int id,String department) {
		this.name=name;
		this.company=company;
		this.id=id;
		this.department=department;
	}
	
	public String acceptname() {
		return name;
	}
	public String acceptcompany() {
		return company;
	}
	public int acceptid() {
		return id;
	}
	public String acceptdepartment() {
		return department;
	}
	
	
}
