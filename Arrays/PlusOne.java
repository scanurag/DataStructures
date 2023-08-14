package Arrays;
import java.util.*;
public class PlusOne {
public static void main(String[] args) {
	int[] digits= {1,2,3};
	System.out.println(Arrays.toString(plusOne(digits)));
}
public static int[] plusOne(int[] digits) {
    int n=digits.length;//{1,2,3} pe ye kya dega n 3 hoga length 
    for(int i=n-1;i>=0;i--)//n-1 i=2 ho gaye ga 
    {
        if(digits[i]<9)//yaha pe digits[2] index pe kya hai 3 hai na 
        {
            digits[i]++;//digits[2]pe value 3 hai na ++ ho ke wo 4 ho jaye gi
            return digits; //aur ye return kar dega 3 ke jagh pe 4
        }
        digits[i]=0;//store karne ke liye hai
    }  
    int[] newNumber=new int[n+1]; //{9,9,9} case me incrment kare ge to {1,0,0,0} size bhi bhad 
    //jaa raha hai na to  hum int[n+1] 
    newNumber[0]=1;//zero poistion pe 1 rahe ga
    return newNumber;
}
}
