import java.util.*;

public class Exc6 {

	public static void main(String args[])
	{
		Complex C1=new Complex(3,2);
		C1.printComplexNumber();
		
		Complex C2=new Complex(9,5);
		C2.printComplexNumber();
		
		Complex C3=new Complex();
		C3=C3.addComp(C1,C2);
		
		System.out.println("sum of");
		C3.printComplexNumber();
		
		C3=C3.subComp(C1, C2);
		System.out.println("substract of");
		C3.printComplexNumber();
	}}
