package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

@Entity
public class Pfe {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	@ManyToOne
		private DomainePfe domaine;
	public Pfe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pfe(Integer id, String nom, DomainePfe domaine) {
		super();
		this.id = id;
		this.nom = nom;
		this.domaine = domaine;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public DomainePfe getDomaine() {
		return domaine;
	}
	public void setDomaine(DomainePfe domaine) {
		this.domaine = domaine;
	}
	

}
