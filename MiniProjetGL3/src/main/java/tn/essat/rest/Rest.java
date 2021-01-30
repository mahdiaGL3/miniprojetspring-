package tn.essat.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.dao.IDomainePfeDao;
import tn.essat.dao.IPfeDao;
import tn.essat.model.DomainePfe;
import tn.essat.model.Pfe;

@RestController 
@CrossOrigin("*")
@RequestMapping("/rest")
public class Rest {
	
	@Autowired
	IPfeDao daopf;
	@Autowired
	IDomainePfeDao daodom;
	
	@GetMapping ("/pfes")
	public List<Pfe> method1(){
		return daopf.findAll();
	}
	
	
	
	
	@GetMapping("/listepfes/{id}")
	public List<Pfe> meth2(@PathVariable("id") int id){
		return daopf.getAllPfeByDomainePfe(id);
		}
	@GetMapping("/chercher/{nom}")
	public List<Pfe> meth3(@PathVariable("nom") String nom){
		return daopf.getAllPfeByNom(nom);
		}
	@GetMapping("/count")
	public Integer meth(){
		return daopf.findAll().size();
		}
@GetMapping("/count2/{id}")
	public Integer meth4(@PathVariable("id") int id){
		return daopf.getAllPfeByDomainePfe(id).size();
		}
	
	
	@GetMapping("/listedomaine")
	public List<DomainePfe> meth2(){
		return daodom.findAll();
	}
	 
	@PostMapping("/add")
	public void get1(@RequestBody Pfe pfe ){
	 daopf.save(pfe);
		
	}
	@DeleteMapping("/delete/{id}")
	public void get2(@PathVariable("id") int id){
		daopf.deleteById(id);
	}
	

}
