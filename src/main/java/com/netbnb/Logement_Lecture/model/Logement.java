/**
 * 
 */
package com.netbnb.Logement_Lecture.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author steph
 *
 */
@Entity
public class Logement {
    @Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private String idLogement;
	
	private Integer idLieu;
	
	private String description;
	
	private Integer prix;

	public Logement(String idLogement, Integer idLieu, String description, Integer prix) {
		super();
		this.idLogement = idLogement;
		this.idLieu = idLieu;
		this.description = description;
		this.prix = prix;
	}


	public String getIdLogement() {
		return idLogement;
	}


	public void setIdLogement(String idLogement) {
		this.idLogement = idLogement;
	}


	public Integer getIdLieu() {
		return idLieu;
	}

	public void setIdLieu(Integer idLieu) {
		this.idLieu = idLieu;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrix() {
		return prix;
	}

	public void setPrix(Integer prix) {
		this.prix = prix;
	}

	
	
	
	
	
}
