package Garwej;
public class methodRp {
public static void main(String[] args) {
	int i=0, j=0;
	j=m1(++i);
	System.out.println(i);//1
	System.out.println(j);//1
}
static int m1(int a) {
	return a++;

}
}
