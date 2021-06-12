package pe.edu.upc.matriculaweb.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.matriculaweb.models.entities.Docente;
import pe.edu.upc.matriculaweb.models.repositories.DocenteRepository;
import pe.edu.upc.matriculaweb.services.DocenteService;

@Service
public class DocenteServiceImpl implements DocenteService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private DocenteRepository docenteRepository;

	@Transactional
	@Override
	public Docente save(Docente entity) throws Exception {
		// TODO Auto-generated method stub
		return docenteRepository.save(entity);
	}

	@Transactional
	@Override
	public Docente update(Docente entity) throws Exception {
		// TODO Auto-generated method stub
		return docenteRepository.save(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return docenteRepository.count();
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		docenteRepository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Docente> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return docenteRepository.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Docente> findAll() throws Exception {
		// TODO Auto-generated method stub
		return docenteRepository.findAll();
	}

}
