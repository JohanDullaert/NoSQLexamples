package be.vdab.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="personen")
public class Persoon {	
	
	private String id;//underscore uit mongoDB is niet nodig
	private String familienaam;	
	private int kinderen;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFamilienaam() {
		return familienaam;
	}
	public void setFamilienaam(String familienaam) {
		this.familienaam = familienaam;
	}
	public int getKinderen() {
		return kinderen;
	}
	public void setKinderen(int kinderen) {
		this.kinderen = kinderen;
	}	

}
