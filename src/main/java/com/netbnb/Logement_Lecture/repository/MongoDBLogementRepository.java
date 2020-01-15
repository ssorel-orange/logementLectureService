/**
 * 
 */
package com.netbnb.Logement_Lecture.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.netbnb.Logement_Lecture.model.Logement;

/**
 * @author steph
 *
 */
public interface MongoDBLogementRepository extends MongoRepository<Logement, Integer>{

	public List<Logement >findByIdLieu (Integer idLieu);
	
}
