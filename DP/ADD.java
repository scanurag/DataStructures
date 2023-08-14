package DP;
import java.util.Scanner;
import java.math.BigInteger;

public class ADD {
	public static void main(String[] args) throws Exception{
		try (var sc = new Scanner(System.in)) {
			int i=12;
			for(i=0;i<=12;i++)
			{
			BigInteger a,b;
			a=sc.nextBigInteger();
			b=sc.nextBigInteger();
			System.out.println(a.add(b));
			}
		}
	}

}
