package oopstask;
interface payment
{
	void transfer();

	

}
class upi implements payment
{

	@Override
	public void transfer() {
		System.out.println("Payment through by upi");
		
	}
	
}
	
	


	
 class creditcard implements payment
{

	@Override
	public void transfer() {
		System.out.println("Payment through by creditcard");
		
	}

	
	

}

public class Paymentdemo {

	public static void main(String[] args) {
		payment p = new upi();
		p.transfer();
		payment p1 = new creditcard();
		p1.transfer();
		
		

	}
}





