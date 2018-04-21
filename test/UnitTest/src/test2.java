import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test2 {

	@Test
	void test() {
		User customor1=new User();
		String name1=customor1.retuName();
		Payment customer=new Payment();
		
		String name2=customer.reName();
		assertEquals(name1, name2);
	}

}
