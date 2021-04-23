package pe.edu.tecsup.springpetclinic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

	@GetMapping("welcome")
	String welcome() {
		return "Welcome to Tecsup";
	}
	
	//
	//    "inicio"
	//    "Semana de Inicio de Clases"
	// 
	@GetMapping("inicio")
	String inicio() {
		return "Semana de inicio de clases";
	}
	
}
