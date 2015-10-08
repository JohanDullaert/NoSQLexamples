package be.vdab.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import be.vdab.model.Persoon;

public interface PersoonDAO extends MongoRepository<Persoon, String> {
	
	List<Persoon> findByFamilienaam(String familienaam);

}
