package com.ista.springboot.proyecto.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Cancion", uniqueConstraints = {@jakarta.persistence.UniqueConstraint(columnNames = {"id_cancion"})})
public class Cancion implements Serializable {
	/****/
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	
	
	    private Long id_cancion;

	    private String titulo;

	    private String artista;

	    private String album;

	    private int año;

	    @ManyToOne
	    @JoinColumn(name = "lista_reproduccion_id")
	    private Reproduccion_Lista listaReproduccion;

	    
	public Long getId_cancion() {
		return id_cancion;
	}
	public void setId_cancion(Long id_cancion) {
		this.id_cancion = id_cancion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getAño() {
		return año;
	}
	
	public Reproduccion_Lista getListaReproduccion() {
		return listaReproduccion;
	}
	public void setListaReproduccion(Reproduccion_Lista listaReproduccion) {
		this.listaReproduccion = listaReproduccion;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
	

}
