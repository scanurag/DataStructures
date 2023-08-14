package DP;
public class GFG {
	    /* Function to reverse arr[] from
		    start to end*/
		    static void rvereseArray(int arr[],int start, int end)
		    {
		        int temp;//0,1,2
		         while (start < end)//1< 4//2<3//3<2X bahar aa jaye ga
		        {
		            temp = arr[start];//0,1,2
		            arr[start] = arr[end];//5,4,3
		            arr[end] = temp;//0,1,2
		            start++;//1,2,3
		            end--;//4,3,2
		        }
		    }  
static void printArray(int arr[],int size)
		    {
		        for (int i = 0; i<size; i++)
		             System.out.print(arr[i] + " ");
		    }
		    public static void main(String args[]) {
		        int arr[] = {1, 2, 3, 4, 5, 6};
		        printArray(arr, 6);
		        rvereseArray(arr,0,5);
		        printArray(arr, 6);
		       }
		}
