package com.objetivos.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")

public class ObjetivosController {
	
	@GetMapping
	public String objetivo() {
		return "Meus objetivos são de me superar e sempre aprender";
	}

}
