package org.ensias.cours.repository;

import java.util.List;

import org.ensias.cours.modele.Cours;
import org.springframework.data.repository.CrudRepository;

public interface CoursRepository extends CrudRepository<Cours, Integer>{
	
	public List<Cours> findByModuleId(Integer moduleId);

}
