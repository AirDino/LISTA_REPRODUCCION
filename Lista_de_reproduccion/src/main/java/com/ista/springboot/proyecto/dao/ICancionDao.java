package com.ista.springboot.proyecto.dao;

import org.springframework.data.repository.CrudRepository;

import com.ista.springboot.proyecto.models.entity.Cancion;


public interface ICancionDao extends CrudRepository<Cancion, Long>{

}
