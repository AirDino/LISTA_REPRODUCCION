package com.ista.springboot.proyecto.models.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Reproduccion")
public class Reproduccion_Lista implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	
	
    private Long id;	    
	private String Nombre;
	private String Descripción;

	@OneToMany(mappedBy = "listaReproduccion", cascade = CascadeType.ALL)
    private List<Cancion> Canciones;
	  
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripción() {
		return Descripción;
	}
	public void setDescripción(String descripción) {
		Descripción = descripción;
	}
	public List<Cancion> getCanciones() {
		return Canciones;
	}
	public void setCanciones(List<Cancion> canciones) {
		Canciones = canciones;
	}
	
}

