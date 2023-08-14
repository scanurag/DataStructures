package Encapsulation;
class Info{
	private int id;
	private String name;
	private int age;
	private char Gender;
	private String Mobile;
	private String Address;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setId(int id) {
		this.id=id;
	}
}
public class StudentEs {
	public static void main(String[] args) {
	Info f1=new Info();
	f1.setId(121);
	f1.setAddress("abcd");
	f1.setName("Anurag");
	f1.setMobile("7234020314");
	f1.setAge(23);
	f1.setGender('m');
	System.out.println(f1.getId());
	System.out.println(f1.getName());
	System.out.println(f1.getAge());
	System.out.println(f1.getGender());
	System.out.println(f1.getMobile());
	System.out.println(f1.getAddress());
	}

}
