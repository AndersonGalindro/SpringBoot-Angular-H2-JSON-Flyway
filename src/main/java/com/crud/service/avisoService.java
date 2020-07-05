package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.crud.aviso.aviso;
import com.crud.repository.avisoRepository;

@Service
public class avisoService {

	@Autowired
	avisoRepository avisoRepository;

	public ResponseEntity<aviso> save(aviso aviso) {
		try {
			return new ResponseEntity<>(avisoRepository.save(aviso ), HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>( HttpStatus.BAD_REQUEST);
		}
	}

	public List<aviso> getAll() {
		return avisoRepository.findAll();
	}

	public ResponseEntity<String> deleteAviso(Integer id) {
		try {
			avisoRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity<aviso> updateAviso(Integer id, aviso aviso) {
		try {
			aviso.setId(id);
			return new ResponseEntity<>(avisoRepository.save(aviso), HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
