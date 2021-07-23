package org.ensias.cours.controleur;


import java.util.List;

import org.ensias.cours.modele.Module;
import org.ensias.cours.service.ModuleService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleControleur {
	
	private ModuleService service;
	
	public ModuleControleur(ModuleService service) {
		this.service = service;
	}
	
	
	@GetMapping("/modules")
	public List<Module> getModules() {
		return service.getModules();
	}
	
	
	@GetMapping("/modules/{id}")
	public Module getModule(@PathVariable Integer id) {
		return service.getModule(id);
	}
	
	@PostMapping(value = "/modules", produces = "application/json")
	public void saveModule(@RequestBody Module module) {
		System.out.println("***BNJOUR***");
		service.ajouterModule(module);
	}
	
	@PutMapping("/modules/{id}")
	public Boolean updateModule(@PathVariable Integer id,@RequestBody Module module){
		return service.modifierModule(id, module);
	}
	
	@DeleteMapping("/modules/{id}")
	public Boolean deleteModule(@PathVariable Integer id) {
		return service.supprimerModule(id);
	}

}
