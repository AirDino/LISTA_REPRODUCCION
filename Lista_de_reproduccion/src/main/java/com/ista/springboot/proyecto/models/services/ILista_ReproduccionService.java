package com.ista.springboot.proyecto.models.services;

import java.util.List;

import com.ista.springboot.proyecto.models.entity.Reproduccion_Lista;

public interface ILista_ReproduccionService {

public List<Reproduccion_Lista> findAll();
	
	public  Reproduccion_Lista save(Reproduccion_Lista ex);
	
	public Reproduccion_Lista findById(long id);
	
	public void delete (long id);	
}
