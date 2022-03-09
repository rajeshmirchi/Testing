import java.util.Arrays;

public class JavaExercise1 {

	public static  int[] insertX(int x,int n,int arr[], int pos) {
		
		int i;
		int newarr[]=new int[n+1];
		for( i=0;i<n+1;i++)
			if(i<pos-1)
				newarr[i]=arr[i];
			else if(i==pos-1)
			     newarr[i]=x;
			else
				newarr[i]=arr[i-1];
	
		
	return newarr;	
	}
	
public static void main(String args[]) {
		
		
		 int n=10;
		 int x=50;
		 int pos =5;
		 int arr[]= {1,2,3,4,5,6,7,8,9,10};
		 int i;
		 System.out.println("initial array"+ Arrays.toString(arr));
		 
		 arr=insertX(x, n, arr, pos);
		 
		 System.out.println("updated" + Arrays.toString(arr));
		 
		 
	}
	
}
