import java.util.Arrays;

public class Count {
	
	public static void main(String args[])
	{
		try {
			String str="neelima uchana";
			char c=str.charAt(8);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoxExceptin");
		}
	}
	
}

