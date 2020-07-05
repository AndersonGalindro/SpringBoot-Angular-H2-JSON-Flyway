package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.aviso.aviso;
import com.crud.avisoRequest.avisoRequest;
import com.crud.service.avisoService;

@RestController
@RequestMapping("/aviso")
public class avisoController {

	@Autowired
	avisoService avisoService;

	@PostMapping
	public ResponseEntity<aviso> save(@RequestBody avisoRequest aviso) {

		return avisoService.save(aviso.avisoResponse());
	}

	@GetMapping
	public List<aviso> getAll() {

		return avisoService.getAll();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAviso(@PathVariable(value = "id") Integer id) {

		return avisoService.deleteAviso(id);
	}

	@PutMapping("/{id}")
	public ResponseEntity<aviso> updateAviso(@PathVariable(value = "id") Integer id, @RequestBody aviso Aviso) {

		return avisoService.updateAviso(id, Aviso);
	}

}
