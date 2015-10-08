package be.vdab.model;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Eigenaar {
	
	private Long id;
	private String naam;
	@Relationship(type="BAASJE_VAN")
	private List<Poes> poes;
	
	// private BaasjeVan baasjeVan; // en dan daar de link naar Poes(, Hond, ....)
	
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
	public List<Poes> getPoes() {
		return poes;
	}
	public void setPoes(List<Poes> poes) {
		this.poes = poes;
	}
	@Override
	public String toString() {
		return "Eigenaar [naam=" + naam + ", poes=" + poes.size() + "]";
	}
	
	
	
}
