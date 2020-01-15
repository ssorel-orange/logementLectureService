package com.netbnb.Logement_Lecture.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.netbnb.Logement_Lecture.model.Logement;

public interface JPALogementRepository extends CrudRepository<Logement, Integer> {
	public List<Logement >findByIdLieu (Integer idLieu);
}
