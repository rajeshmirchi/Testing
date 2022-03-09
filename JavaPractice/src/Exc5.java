
public class Exc5 

{
	int rl; int img;
	
	Exc5()
	{
		
	}
	
	Exc5(int temprl, int tempimg){
		
		rl=temprl;
		img=tempimg;
	}
	Exc5 addEx(Exc5 E1, Exc5 E2) {
		
		Exc5 temp=new Exc5();
		temp.rl=E1.rl+E2.rl;
		temp.img=E1.img+E2.img;
		
		return temp;
	}
	
	Exc5 subEx(Exc5 E1, Exc5 E2) {
		
		Exc5 temp=new Exc5();
		temp.rl=E1.rl-E2.rl;
		temp.img=E1.img-E2.img;
		return temp;
		
	}
	
	void printExc5Number() {
		System.out.println("Exc5number"+rl+" + "+img+"i");
	}
	
}
