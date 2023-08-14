class Merge{
	public static void main(String[] args) {
		int[] a= {1,3,4,5};
		int[] b= {2,4,6,8};
		int a_leng=a.length;
		int b_leng=b.length;
		int c_leng=a_leng+b_leng;
		int[] c=new int[c_leng];
		for(int i=0; i<a_leng;i++) {
			c[i]=a[i];
		}
		for(int i=0; i<b_leng;i++) {
			c[a_leng+i]=b[i];
		}
		for(int i=0;i<c_leng;i++)
		{
			System.out.print(c[i]+" ");
		}
		}
}