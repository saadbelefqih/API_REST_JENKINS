package org.ensias.cours.controleur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControleur {
	
	@GetMapping("/hellospring")
	public String helloSpring(){
		return "Bienvenue au framework Spring Boot";
	}

}
