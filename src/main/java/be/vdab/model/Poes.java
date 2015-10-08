package be.vdab.model;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Poes {
	
	private Long id;
	private String naam;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	@Override
	public String toString() {
		return "Poes [naam=" + naam + "]";
	}	

	
}
