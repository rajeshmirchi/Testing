
public class PaymentFc {

	public PaymentConfirmation createPayment(Payment p)throws Exception
	{
		PaymentConfirmation pc=null;
		try {
		validatePayment(p);
		pc=insertPayment(p);
		}
		catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
		
		return pc;
	}
	
	private PaymentConfirmation insertPayment (Payment p)
	{
		PaymentConfirmation pc=new PaymentConfirmation();
		pc.setAccountNum(p.getAccountNum());

		System.out.println();
		return pc;
	}
	
	private void validatePayment(Payment p)throws Exception
	{
		if(p.getAccountName()==null)
		{
			throw new Exception("account name is mandatory");
		}
		
		if(p.getAccountNum()==0)
			
		{
			throw new Exception("invaid");
		
		}
		
		if(p.getAmount()==0)
		{
			throw new Exception("invaid");
		
		}
	}
	
	
}
