package BasicJSP;
public class Cotinue {
public static void main(String[] args) {
	int n=5;
	for(int i=1; i<=n; i++) {
			if(i%3==0) continue;
			System.out.println(i);
		}
}
}
