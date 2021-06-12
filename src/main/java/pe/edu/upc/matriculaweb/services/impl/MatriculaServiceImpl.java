package pe.edu.upc.matriculaweb.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.matriculaweb.models.entities.Matricula;
import pe.edu.upc.matriculaweb.models.repositories.MatriculaRepository;
import pe.edu.upc.matriculaweb.services.MatriculaService;

public class MatriculaServiceImpl implements MatriculaService, Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private MatriculaRepository matriculaRepository;
	
	@Transactional
	@Override
	public Matricula save(Matricula entity) throws Exception {
		// TODO Auto-generated method stub
		return matriculaRepository.save(entity);
	}

	@Transactional
	@Override
	public Matricula update(Matricula entity) throws Exception {
		// TODO Auto-generated method stub
		return matriculaRepository.save(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return matriculaRepository.count();
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		matriculaRepository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Matricula> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return matriculaRepository.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Matricula> findAll() throws Exception {
		// TODO Auto-generated method stub
		return matriculaRepository.findAll();
	}

}
