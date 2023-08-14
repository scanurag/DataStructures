//Place Tiles of size 1*m in a floor of size n*m:
package DSA;
public class Placetiles {
public static int placeTiles(int n,int m) {
	if(n==m) {
		return 2;
	}
	if(n<=m) {
		return 1;
	}
	int verticalPlasement=placeTiles(n-m,m);
	int horPlasement=placeTiles(n-1,m);
	return verticalPlasement+horPlasement;
}
public static void main(String[] args) {
	int n=4,m=2;
	int newstp=placeTiles(n,m);
	System.out.println(newstp);
}
}
