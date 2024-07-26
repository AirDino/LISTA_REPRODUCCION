package com.ista.springboot.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ista.springboot.proyecto.models.entity.Cancion;
import com.ista.springboot.proyecto.models.services.ICancionService;



@RestController
@RequestMapping("/api")
public class CancionController {

	
	@Autowired
	private ICancionService CanService;

	/*LISTAR*/
	@GetMapping ("/Cancion")
	public List<Cancion> index(){
		return CanService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/Cancion/{id}")
	public Cancion show(@PathVariable Long id) {
		return CanService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/Cancion")
	@ResponseStatus (HttpStatus.CREATED)
	public Cancion create(@RequestBody Cancion can ) {
		return CanService.save(can);
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/Cancion/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		CanService.delete(id);
	}
	
	/*EDITAR*/
	@PutMapping ("/Cancion/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public Cancion update(@RequestBody Cancion ca,@PathVariable Long id) {
		Cancion can  = CanService.findById(id);
		can.setTitulo(ca.getTitulo());
		can.setArtista(ca.getArtista());
		can.setAlbum(ca.getAlbum());
		can.setAño(ca.getAño());
		
		return CanService.save(can);	
	}
	
}
