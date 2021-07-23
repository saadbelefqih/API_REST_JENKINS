package org.ensias.cours.modele;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
public class Cours {
	@Id
	private int id;
	private String nom;
	private String description;
	@ManyToOne
	private Module module;
	
	
	public Cours(int id, String nom, String description, Module module) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.module = module;
	}
	
	
	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	
	
	

}
