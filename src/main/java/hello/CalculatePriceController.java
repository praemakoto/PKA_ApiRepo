package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pka.service.CalculatePrice;

@RestController
public class CalculatePriceController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/calculatePrice")
    public Double greeting(@RequestParam(value="price", defaultValue="0") Double price) {
    	CalculatePrice calculatePrice = new CalculatePrice();
    	return calculatePrice.calucationTotalPrice(price);
    }

}
