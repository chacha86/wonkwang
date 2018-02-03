package crudExam;

public class Customer {

	private String id;
	private String name;
	private String pass;
	private char gender;
	
	public Customer() {
		
	}
	
	public Customer(String id, String name, String pass, char gender) {
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.gender = gender;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void print() {
		String str = "아이디 : " + this.id + "\n" + "이름 : " + this.name 
				+ "\n" + "성별 : " + this.gender;
		
		System.out.println(str);
	}
}
