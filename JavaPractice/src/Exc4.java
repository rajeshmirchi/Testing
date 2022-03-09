
public class Exc4 {
	
	public static void main(String args[])
	{
	Exc5 E1=new Exc5(5,1);
	E1.printExc5Number();
	
	Exc5 E2=new Exc5(9,4);
	E2.printExc5Number();
	
	Exc5 E3=new Exc5();
	E3=E3.addEx(E1, E2);
	System.out.println("sum of");
	
	E3.printExc5Number();
	
	E3=E3.subEx(E1, E2);
	System.out.println("sub of");

	E3.printExc5Number();
	
	}
	
}
