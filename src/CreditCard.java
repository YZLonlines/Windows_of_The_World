package D4;

public class CreditCard extends Payment{
	int cardNumber;
	int securityCode;
	int date;

	protected abstract void billingAddress()
	{
		
	}

	protected abstract void UploadPaymentInfo()
	{
		
	}
}
