package br.com.spindola.unicesumar.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@GetMapping(path = {"/ola", "/oi"})
	public String ola() {
		return "Olá Spring Boot";
	}
}
