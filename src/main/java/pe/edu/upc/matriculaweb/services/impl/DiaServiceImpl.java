package pe.edu.upc.matriculaweb.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.matriculaweb.models.entities.Dia;
import pe.edu.upc.matriculaweb.models.repositories.DiaRepository;
import pe.edu.upc.matriculaweb.services.DiaService;

public class DiaServiceImpl implements DiaService, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private DiaRepository diaRepository;

	
	@Transactional
	@Override
	public Dia save(Dia entity) throws Exception {
		// TODO Auto-generated method stub
		return diaRepository.save(entity);
	}

	@Transactional
	@Override
	public Dia update(Dia entity) throws Exception {
		// TODO Auto-generated method stub
		return diaRepository.save(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return diaRepository.count();
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		diaRepository.deleteById(id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<Dia> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return diaRepository.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Dia> findAll() throws Exception {
		// TODO Auto-generated method stub
		return diaRepository.findAll();
	}

}
