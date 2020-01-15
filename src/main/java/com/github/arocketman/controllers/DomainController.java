package com.github.arocketman.controllers;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.ResourceNotFoundException;
import com.github.arocketman.entities.Domain;
import com.github.arocketman.repositories.DomainRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class DomainController {
	
@Autowired
private  DomainRepository domainRepository;
	
	@GetMapping("/test")
	public String test() {
		return "Hello World";
	}
	
	@GetMapping("/domains")
	 List<Domain> getAllDomains() {
		return domainRepository.findAll();
	}
	
	@GetMapping("/domain/{id}")
	public ResponseEntity<Domain> getDomainById(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
			Domain domain = domainRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("domain not found for this id :: " + id));
		return ResponseEntity.ok().body(domain);
	}
	
	@GetMapping("/domainbycode/{code}")
	public ResponseEntity<Domain> getDomainByCode(@PathVariable(value = "code") String code)
			throws ResourceNotFoundException {
			Domain domain = domainRepository.getDomainByCode(code);
			if(domain == null) {
			new ResourceNotFoundException("domain not found for this id :: " + code);
			}
		return ResponseEntity.ok().body(domain);
	}

	@PostMapping("/domain")
	public Domain createEmployee(@Valid @RequestBody Domain domain) {
		return domainRepository.save(domain);
	}
	
	@PutMapping("/updatedomain/{id}")
	public ResponseEntity<Domain> updateDomain(@PathVariable(value = "id") Long id,
			@Valid @RequestBody Domain domainDetails) throws ResourceNotFoundException {
		Domain domain = domainRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));

		domain.setCode(domainDetails.getCode());
		domain.setDomain(domainDetails.getDomain());
		domain.setPort(domainDetails.getDomain());
		final Domain updatedAdmin = domainRepository.save(domain);
		return ResponseEntity.ok(updatedAdmin);
	}
	
	@DeleteMapping("/deletedomain/{id}")
	public Map<String, Boolean> deletedomain(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		Domain domain = domainRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));

		domainRepository.delete(domain);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

}
