package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiescritorio")
@AllArgsConstructor //lombok cria um construtor com todos os escritorios

public class EscritorioControle {

	EscritorioRepositorio repository;
	
	@GetMapping("/escritorio")
	public List<Escritorio> getAllEscritorios(){
		return repository.findAll();
	}
	//pega todos os escritorios
	
	
	@GetMapping("/escritorio/{id}")
	public Escritorio getEscritorioById(@PathVariable("id") Long id) {
		return repository.findById(id).get();
	}
	//procurar pelo id

	@PostMapping("/escritorioadd")
	public Escritorio saveEscritorio(@RequestBody Escritorio escritorio) {
		return repository.save(escritorio);
	}
	//adicionar escritorio, vem no formato json

	@DeleteMapping("/escritoriodelete/{id}")
	public void deleteEscritorio(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
	
}
