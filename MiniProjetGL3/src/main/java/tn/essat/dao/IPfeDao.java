package tn.essat.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tn.essat.model.Pfe;

public interface IPfeDao extends JpaRepository  <Pfe, Integer>{
	@Query("select p from Pfe p where p.domaine.id=?1")
	public List<Pfe> getAllPfeByDomainePfe(int id);
	@Query("select p from Pfe p where p.nom=?1")
	public List<Pfe> getAllPfeByNom(String nom);
}
