package org.ensias.cours.service;

import java.util.ArrayList;
import java.util.List;

import org.ensias.cours.modele.Module;
import org.ensias.cours.repository.ModuleRepository;
import org.springframework.stereotype.Service;

@Service
public class ModuleService {
	
	private ModuleRepository moduleRepository;
	
	
	
	public ModuleService(ModuleRepository repository) {
		super();
		this.moduleRepository = repository;
	}

	public List<Module> getModules() {
		List<Module> modules=new ArrayList<>();
		moduleRepository.findAll().forEach(modules::add);
		return modules;
	}
	
	public Module getModule(Integer id) {
		    return moduleRepository.findById(id).orElse(null);
	}
	
	public void ajouterModule(Module module) {
		moduleRepository.save(module);
	}
	
	
	public Boolean modifierModule(Integer id,Module module) {
		if(moduleRepository.existsById(id)) {
			module.setId(id);
			moduleRepository.save(module);
			return true;
		}
		return false;
	}
	
	public Boolean supprimerModule(Integer id) {
		if(moduleRepository.existsById(id)) {
		moduleRepository.deleteById(id);
		return true;
		}
		return false;
		
	}

	
	



}
