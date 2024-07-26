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

import com.ista.springboot.proyecto.models.entity.Reproduccion_Lista;
import com.ista.springboot.proyecto.models.services.ILista_ReproduccionService;


@RestController
@RequestMapping("/api")
public class Lista_ReproduccionController {

	
	@Autowired
	private ILista_ReproduccionService LisService;

	/*LISTAR*/
	@GetMapping ("/Lista")
	public List<Reproduccion_Lista> index(){
		return LisService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/Lista/{id}")
	public Reproduccion_Lista show(@PathVariable Long id) {
		return LisService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/Lista")
	@ResponseStatus (HttpStatus.CREATED)
	public Reproduccion_Lista create(@RequestBody Reproduccion_Lista can ) {
		return LisService.save(can);
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/Lista/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		LisService.delete(id);
	}
	
	/*EDITAR*/
	@PutMapping ("/Lista/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public Reproduccion_Lista update(@RequestBody Reproduccion_Lista ca,@PathVariable Long id) {
		Reproduccion_Lista lis  = LisService.findById(id);
		lis.setDescripción(ca.getDescripción());
		lis.setCanciones(ca.getCanciones());
		
		
		return LisService.save(lis);	
	}
	
}