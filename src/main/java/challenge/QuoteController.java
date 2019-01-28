package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class QuoteController {

	@Autowired
	private QuoteService service;

	@GetMapping("/v1/quote")
	public Quote getQuote(){
		return service.getQuote();
	}

	@GetMapping("/v1/quote/{actor}")
	public Quote getQuoteByActor(@PathVariable String actor){

		return service.getQuoteByActor(actor);
	}
}