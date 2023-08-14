package String;
public class test {//26
	public static void main(String[] args) {
		String s= "AB";
		System.out.println(Agk(s));
}
	public static int Agk(String s) {
		int ans=0;
		int P=0;
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			int var=(int)c-65+1;
			ans +=var*Math.pow(26,P);
			P++;
			
		}
		return ans;
		
	}
}
