package String;

public class CanPlaceFlowers
 {
public static void main(String[] args) {
	int[] flowerbed= {1,0,0,0,1};
	int n=1;
	System.out.println(canPlaceFlowers(flowerbed,n));
	
}
public static boolean canPlaceFlowers(int[] flowerbed, int n) {
    int count =0;
     for (int i = 0; i < flowerbed.length; i++) {
         if (flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
          count++;
          flowerbed[i]=1;
          if(count>=n) break;
         }
     }
     return count>=n ? true:false;
 }
}
