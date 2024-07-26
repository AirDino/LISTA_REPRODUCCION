package com.ista.springboot.proyecto.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ista.springboot.proyecto.dao.ICancionDao;
import com.ista.springboot.proyecto.models.entity.Cancion;

@Service
public class CancionServiceImpl implements ICancionService{

	@Autowired
	private ICancionDao CancionDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Cancion> findAll() {
	return (List<Cancion>) CancionDao.findAll();
	}
	
	@Override
	@Transactional
	public Cancion save(Cancion can) {
		return CancionDao.save(can);
	}
	
	@Override
	@Transactional (readOnly = true)
	public Cancion findById(long id) {
		return CancionDao.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void delete(long id) {
		CancionDao.deleteById(id);
	}
}
