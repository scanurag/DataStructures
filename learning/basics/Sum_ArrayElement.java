package learning.basics;

public class Sum_ArrayElement {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		// fully qualified class name means a class name with package name
		int[]number=new int[4];
		for(int i=0;i<number.length;i++)
		{
			System.out.println("Enter Number :"+(i+1));
			int num=sc.nextInt();
			number[i]=num;
		}
		int sum=0;
		for(int x:number)
		{
			System.out.println("array element are"+x);
			sum=sum+x;
		}
		System.out.println("sum of array elements is"+sum);
		sc.close();
		}
	
	}


