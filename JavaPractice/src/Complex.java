
public class Complex {

	 
	int real; int imaginary; 
	
	Complex()
	{}
	
	Complex(int tempreal, int tempimaginary)
	{
		real=tempreal;
		
		imaginary=tempimaginary;
	}
	Complex addComp(Complex C1, Complex C2)
	{
		Complex temp=new Complex();
		
		temp.real=C1.real+C2.real;
		
		temp.imaginary=C1.imaginary+C2.imaginary;
		return temp;
	}
	
	Complex subComp(Complex C1, Complex C2) {
		
		Complex temp=new Complex();
		temp.real=C1.real-C2.real;
		temp.imaginary=C1.imaginary-C2.imaginary;
		return temp;
		
	}
	void printComplexNumber()
	{
		System.out.println("complexnumber: "+real + " + "+imaginary + "i");
		
	}
}
