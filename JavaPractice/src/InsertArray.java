import java.util.Arrays;

public class InsertArray {
	
	static int endsWith(String str, String suff) 
	{
		int cnt=0;
		String words[] = str.split(" ");
		for(int i=0;i<words.length;i++)
			if(words[i].endsWith(suff))
				cnt++;
		
		return cnt;
	}

	public static void main(String args[])
	{
		String str="neelima is a good girl and deetya is a bad girl ,pushpa is ";
		
		String suff="is";
		
		System.out.println(endsWith(str,suff));
				
	}
}

