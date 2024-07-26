package com.ista.springboot.proyecto.models.services;

import java.util.List;

import com.ista.springboot.proyecto.models.entity.Cancion;


public interface ICancionService {

public List<Cancion> findAll();
	
	public  Cancion save(Cancion ex);
	
	public Cancion findById(long id);
	
	public void delete (long id);	
	
}
