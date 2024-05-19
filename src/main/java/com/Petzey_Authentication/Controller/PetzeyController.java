package com.Petzey_Authentication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Petzey_Authentication.Credentials.CredentialService;
import com.Petzey_Authentication.Entity.Credentials;
import com.Petzey_Authentication.Exception.CredException;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/credentials")
@CrossOrigin("*")
public class PetzeyController {

	@Autowired
	private CredentialService service;

	@PostMapping("/savecredentials")
	@Operation(summary = "saving creds")
	public ResponseEntity<?> post(@RequestBody Credentials creds) throws CredException {
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<>(service.saveCredentials(creds), HttpStatus.OK);
		} catch (CredException e) {
			response = new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
		}
		return response;
	}
	
	
//	@GetMapping("/getrole")
//	@Operation(summary = "Get Role By Mail")
//	public ResponseEntity<?> get(@RequestBody Credentials creds) throws CredException {
//		ResponseEntity<?> response = null;
//		try {
//			response = new ResponseEntity<>(service.saveCredentials(creds), HttpStatus.OK);
//		} catch (CredException e) {
//			response = new ResponseEntity<>(e.getMessage(), HttpStatus.OK);
//		}
//		return response;
//	}
	

	
	@GetMapping("/getall/{emailid}")
	@Operation(summary = "get by email ")
	public ResponseEntity<?> getall(@PathVariable (value = "emailid") String emailid){
		ResponseEntity<?> response = null;
		response = new ResponseEntity<>(service.getRoleAndIdByEmail(emailid),HttpStatus.OK);
		return response;
	}
	
	
}
