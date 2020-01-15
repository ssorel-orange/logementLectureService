/**
 * 
 */
package com.netbnb.Logement_Lecture.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netbnb.Logement_Lecture.model.Logement;
import com.netbnb.Logement_Lecture.service.LogementService;

/**
 * @author steph
 *
 */
@RestController
@RequestMapping("/api/logement/v1")
public class LogementServiceController {
	@Autowired
	private LogementService logementService;
	
    
	
	@GetMapping(value = "/lieu/{idLieu}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Logement> getLogementByLieu (@PathVariable Integer idLieu) {		
		return logementService.getLogementByLieu(idLieu);
	}
	
	@PostMapping(value = "/logement", produces = MediaType.APPLICATION_JSON_VALUE)
	public Logement saveLogement (@RequestBody Logement logement) {
		return logementService.saveLogement(logement);
	
	}
	
	
}
