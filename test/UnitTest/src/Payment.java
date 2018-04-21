
public class Payment {
	public Payment() {}
	public String payName="John";
	public String reName()
	{
		return payName;
	}
	public void pay()
	{
		billingAddress();
		UploadPaymentInfo();
	}
	protected void billingAddress() {
	}
	protected void UploadPaymentInfo() {
	}	
	 
	shoppingCart goods=new shoppingCart();
	public double payMoney(shoppingCart goods,int n1, int n2, int n3)
	{
		double total=goods.product1*n1+goods.product2*n2+goods.product3*n3;
		System.out.println("Payment.payMoney()");
		return goods.product1;
		
	}
}
