package org.ensias.cours.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.ensias.cours.modele.Cours;
import org.ensias.cours.repository.CoursRepository;
import org.springframework.stereotype.Service;

@Service
public class CoursService {
	
	private CoursRepository coursRepository;
	
	
	
	public CoursService(CoursRepository coursRepository) {
		this.coursRepository = coursRepository;
	}

	//la méthode getCours pour charger tous les cours
	public List<Cours> getAllCours(Integer moduleId) { 
		List<Cours> cours=new ArrayList<>();
		coursRepository.findByModuleId(moduleId).forEach(cours::add);
		return cours; 
	}
	
	//la méthode getCours pour charger un cours par Id
	public Optional<Cours> getCours(Integer id) {
		return coursRepository.findById(id);	
	}
	
	//la méthode save est implémentée dans CourseRepository
	public void ajouterCours(Cours cours) {
		coursRepository.save(cours); 
	}
	
	//ici save dans le rôle de la mise à jour
	public void modifierCours(Cours cours) {
		coursRepository.save(cours); 
	}
	//ici supprimerCours dans le rôle de la suppression
	public void supprimerCours(Integer id) {
		coursRepository.deleteById(id); 	
	}


}
