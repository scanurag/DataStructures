package ConstructorJSP;
public class PrivateConstructor {
int  a;
double b;
String c;
private PrivateConstructor(int a,double b,String c) {
	this.a=a;
	this.b=b;
	this.c=c;
}
public void m3() {
	System.out.println(a+" "+b+" " +c);
}
public static void main(String[] args) {
	PrivateConstructor	l=new PrivateConstructor(22, 1999,"AnuragKajol");
	l.m3();
}
}
//Private ko hum out side class access nhi kar sakte hai
//Private hum tab use karte hai jab hame securty chahiye ho ti hai
//agar humout side class dusra class bana ke usme public void main (String[] arg)
//ko call karye ge to error dega kiw ki ye in side class hi access kar sakte hai