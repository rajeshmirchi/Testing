import java.util.Arrays;

public class Exc2 {

	public static int[] insertX(int n,int x,int pos,int arr[]) {
		int i;
		int newarr[]=new int[n+1];
		for(i=0;i<n+1;i++)
			if(i<pos-1)
				newarr[i]=arr[i];
			else if(i==pos-1)
				newarr[i]=x;
			else 
				newarr[i]=arr[i-1];
	
	return newarr;
	}
	public static void main(String args[]) {
		int n=5;
		int x=22;
		int pos= 3;
		int i;
		int arr[]= {1,1,1,1,1};
		System.out.println("initial array"+Arrays.toString(arr));
		
		arr=insertX(n, x, pos,arr);
		
		System.out.println("upsated"+ Arrays.toString(arr));
		
		
		
	}
	
	
	
}
