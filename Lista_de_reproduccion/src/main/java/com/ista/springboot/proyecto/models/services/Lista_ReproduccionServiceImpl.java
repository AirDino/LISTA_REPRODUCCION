package com.ista.springboot.proyecto.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.proyecto.dao.ILista_ReproduccionDao;
import com.ista.springboot.proyecto.models.entity.Reproduccion_Lista;

@Service
public class Lista_ReproduccionServiceImpl implements ILista_ReproduccionService{
	
	@Autowired
	private ILista_ReproduccionDao ListaDao;

	@Override
	@Transactional (readOnly = true)
	public List<Reproduccion_Lista> findAll() {
		return (List<Reproduccion_Lista>) ListaDao.findAll();}

	@Override
	@Transactional
	public Reproduccion_Lista save(Reproduccion_Lista avi) {
		return ListaDao.save(avi);}

	@Override
	@Transactional (readOnly = true)
	public Reproduccion_Lista findById(long id) {
		return ListaDao.findById(id).orElse(null);}

	@Override
	@Transactional
	public void delete(long id) {
		ListaDao.deleteById(id);}
}
