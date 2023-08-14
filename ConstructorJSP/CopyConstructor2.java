package ConstructorJSP;
class jk{
	int id;
	String name;
	int age;
	public jk(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public void ShowO() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println("*************************");
	}
	public jk(int id,String name,jk j) {
		this.id=id;
		this.name=name;
		this.age=j.age;
	}
	public jk(int id,jk l,int age) {
		this.id=id;
		this.name=l.name;
		this.age=age;
	}
}
public class CopyConstructor2 {
public static void main(String[] args) {
jk	j1=new jk(101,"Raj",21);
 	j1.ShowO();
jk j2=new jk(102,"Kran",j1);
j2.ShowO();
jk j3=new jk(103,j1,23);
j3.ShowO();
}
}
