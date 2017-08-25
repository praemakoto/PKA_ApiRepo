package flight;

import org.junit.Assert;
import org.junit.Test;

import com.pka.service.CalculatePrice;

public class CalculatePriceTest {

	@Test
	public void total_price_must_be_214_when_price_100() {
		CalculatePrice calculatePrice = new CalculatePrice();
		Assert.assertEquals(214d, calculatePrice.calucationTotalPrice(100), 0d);
	}
}
