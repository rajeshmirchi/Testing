
public class Exc3 
{
	static String extractInt(String str)
	{
		str=str.replaceAll("[^\\d]", " ");
		str=str.trim();
		str=str.replaceFirst(" +", "");
		if(str.equals(" "))
			return "-1";
		return str;
					
	}
	
	public static void main(String args[])
	{
		String str="avbkjd1122k1j4 543 af";
		System.out.println(extractInt(str));
	}
		

}
