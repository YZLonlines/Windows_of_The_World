package D4;

public abstract class Payment {
	public void pay()
	{
		billingAddress();
		UploadPaymentInfo();
	}
	protected abstract void billingAddress();
	protected abstract void UploadPaymentInfo();
	
	private static final Payment INSTANCE = new Payment(); 
	private Payment() {}
	public static Payment getInstance() {
		return INSTANCE; }
}
