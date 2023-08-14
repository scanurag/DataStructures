package Garwej;
public class methodUk {
public static void main(String[] args) {
	int i=0,j=0;
	j=m1(i++)+ m1(++i)+m1(i);
	System.out.println(i);
	System.out.println(j);
}
static int m1(int a) {
	return a++;
}
}
