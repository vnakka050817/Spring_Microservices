package web.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Welcome")
public class WelcomeResource {
	
	@RequestMapping()
	public String plainWelcome() {
		return "Welcome to Spring Rest";
	}
	
	@RequestMapping("{username}")
	public String welcomeName(@PathVariable("username") String Name) {
		return "Welcome" +Name;
	}
	

}
