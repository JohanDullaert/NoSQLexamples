package be.vdab.dao;

import java.util.List;

import org.springframework.data.neo4j.repository.GraphRepository;

import be.vdab.model.Eigenaar;

public interface EigenaarDAO extends GraphRepository<Eigenaar>{

	public List<Eigenaar> findByNaam(String naam);
	
}
