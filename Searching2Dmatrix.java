
public class Searching2Dmatrix {
public static void main(String[] args) {
	int[][] matrix= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
	int target=3;
	System.out.println(search(matrix,target));
}
public static boolean search(int[][] matrix,int target) {
	if(matrix.length==0) return false;
	int rows=matrix.length;
	int col=matrix[0].length;
	int start=0;
	int end=rows*col-1;
	while(start<=end) {
		int midpoint=start+(end-start)/2;
		int midpoint_element=matrix[midpoint/col][midpoint%col];
		//System.out.println(midpoint_element);
	    if(midpoint_element==target) return true;
	    else if(target<midpoint_element) end=midpoint-1;
	    else if(target>midpoint_element) start=midpoint+1;
	   
	}
	return false;
}

}
