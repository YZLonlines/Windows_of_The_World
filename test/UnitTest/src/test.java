import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment pay1=new Payment();
		shoppingCart goods = new shoppingCart();
		double total=pay1.payMoney(goods, 1, 1, 1);
		System.out.println(total);
	}

}
