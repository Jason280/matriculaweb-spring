package pe.edu.upc.matriculaweb.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.matriculaweb.models.entities.DocenteCurso;
import pe.edu.upc.matriculaweb.models.repositories.DocenteCursoRepository;
import pe.edu.upc.matriculaweb.services.DocenteCursoService;

@Service
public class DocenteCursoServiceImpl implements DocenteCursoService, Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private DocenteCursoRepository docenteCursoRepository;
	
	@Transactional
	@Override
	public DocenteCurso save(DocenteCurso entity) throws Exception {
		// TODO Auto-generated method stub
		return docenteCursoRepository.save(entity);
	}

	@Transactional
	@Override
	public DocenteCurso update(DocenteCurso entity) throws Exception {
		// TODO Auto-generated method stub
		return docenteCursoRepository.save(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return docenteCursoRepository.count();
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		docenteCursoRepository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<DocenteCurso> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return docenteCursoRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<DocenteCurso> findAll() throws Exception {
		// TODO Auto-generated method stub
		return docenteCursoRepository.findAll();
	}

}
