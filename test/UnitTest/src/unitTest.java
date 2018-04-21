import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class unitTest {

	@Test
	void test() {
		Payment pay1=new Payment();
		shoppingCart goods = new shoppingCart();
		double total=pay1.payMoney(goods, 1, 1, 1);
		assertEquals(600.00, total);
	}

}
