//package com.github.arocketman.controllers;
//
//import java.util.HashMap;
//
//import java.util.List;
//import java.util.Map;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.exception.ResourceNotFoundException;
//import com.github.arocketman.entities.Admin;
//import com.github.arocketman.repositories.AdminRepository;
//
//
//
//@CrossOrigin(origins = "http://localhost:4200")
//@RestController
//@RequestMapping("/api")
//public class AdminController {
//	@Autowired
//	private AdminRepository adminRepository;
//
//	@GetMapping("admins")
//	public List<Admin> getAllEmployees() {
//		return adminRepository.findAll();
//	}
//
//	@GetMapping("/admin/{id}")
//	public ResponseEntity<Admin> getEmployeeById(@PathVariable(value = "id") Long id)
//			throws ResourceNotFoundException {
//		Admin employee = adminRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
//		return ResponseEntity.ok().body(employee);
//	}
//
//	@PostMapping("/admin")
//	public Admin createEmployee(@Valid @RequestBody Admin employee) {
//		return adminRepository.save(employee);
//	}
//
//	@PutMapping("/updateadmin/{id}")
//	public ResponseEntity<Admin> updateEmployee(@PathVariable(value = "id") Long id,
//			@Valid @RequestBody Admin adminDetails) throws ResourceNotFoundException {
//		Admin admin = adminRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
//
//		admin.setUserName(adminDetails.getUserName());
//		admin.setPassword(adminDetails.getPassword());
//		final Admin updatedAdmin = adminRepository.save(admin);
//		return ResponseEntity.ok(updatedAdmin);
//	}
//
//	@DeleteMapping("/deleteadmin/{id}")
//	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long id)
//			throws ResourceNotFoundException {
//		Admin admin = adminRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
//
//		adminRepository.delete(admin);
//		Map<String, Boolean> response = new HashMap<>();
//		response.put("deleted", Boolean.TRUE);
//		return response;
//	}
//}
