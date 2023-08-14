package MethodOverloding;
class J{
	public void mo(int i) {
		System.out.println(i);
	}
	public void mo(String i) {
		System.out.println(i);
	}
}
public class FirstProgramOv {
public static void main(String[] args) {
	J j = new J();
	j.mo(45);
	j.mo("Anurag");
}
}
