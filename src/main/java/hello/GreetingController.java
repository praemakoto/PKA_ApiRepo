package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pka.dao.FlightyDAO;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @RequestMapping("/getFlightPrice")
    public Price test(@RequestParam(value="noFlight", defaultValue="DD3202") String noFlight) {
    	noFlight = "DD3202";
    	Double totalPrice = new Double(0);
    	try {
    		FlightyDAO flightyDAO = new FlightyDAO();
    		totalPrice = flightyDAO.getPriceByFlight(noFlight);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	 
    	return new Price(totalPrice);
    }
}
