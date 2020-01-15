/**
 * 
 */
package com.netbnb.Logement_Lecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netbnb.Logement_Lecture.model.Logement;
import com.netbnb.Logement_Lecture.repository.JPALogementRepository;
import com.netbnb.Logement_Lecture.repository.MongoDBLogementRepository;

/**
 * @author steph
 *
 */
@Service
public class LogementService {
	@Autowired
	private JPALogementRepository logementRepo;
	@Autowired
	private MongoDBLogementRepository mongoLogementRepo;
	
	
	public List<Logement> getLogementByLieu (Integer idLieu) {
		return mongoLogementRepo.findByIdLieu(idLieu);
		
	}
	
	public Logement saveLogement (Logement logementToSave) {
		return mongoLogementRepo.save(logementToSave);
	}

}
