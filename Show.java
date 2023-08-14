
public class Show {
	public static int len(int n) {
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
	public static int armFind(int n) {
		int p=len(n);
		int sum=0;
		while(n>0) {
			int d=n%10;
			int fact=1;
			for(int i=1;i<=p;i++) {
				fact*=d;
			}
			sum+=fact;
			n/=10;
		}
		return sum;
	}
public static void main(String[] args) {
	int num1=1;
	int num2=2000;
	for(int i=num1;i<=num2;i++) {
		if(i==armFind(i)) System.out.println(i);
	}


}
}
/*
1 2345
109876*/