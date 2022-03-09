
public class PaymentMde {

	public static void main (String args[]) throws Exception {
		Payment pp=new Payment();
		
		pp.setAccountName("neelima");
		pp.setAccountNum(100);
		pp.setAmount(700);
		
	
		PaymentFc ab=new PaymentFc();
		PaymentConfirmation pc=ab.createPayment(pp);
		System.out.println( +pc.getAccountNum());		
	}
}


