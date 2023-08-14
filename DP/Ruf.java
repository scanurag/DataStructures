package DP;

public class Ruf {
	static void printArray(int arr[],int size)
    {
        for (int i = 0; i < size; i++)
             System.out.print(arr[i] + " ");
         // System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
       printArray(arr, 6);
    }
}
