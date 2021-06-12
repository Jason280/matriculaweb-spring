package pe.edu.upc.matriculaweb.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.matriculaweb.models.entities.Curso;
import pe.edu.upc.matriculaweb.models.repositories.CursoRepository;
import pe.edu.upc.matriculaweb.services.CursoService;

@Service
public class CursoServiceImpl implements CursoService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CursoRepository cursoRepository;

	@Transactional
	@Override
	public Curso save(Curso entity) throws Exception {
		// TODO Auto-generated method stub
		return cursoRepository.save(entity);
	}

	@Transactional
	@Override
	public Curso update(Curso entity) throws Exception {
		// TODO Auto-generated method stub
		return cursoRepository.save(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return cursoRepository.count();
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		cursoRepository.deleteById(id);
	}

	
	@Transactional(readOnly = true)
	@Override
	public Optional<Curso> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return cursoRepository.findById(id);
	}

	
	@Transactional(readOnly = true)
	@Override
	public List<Curso> findAll() throws Exception {
		// TODO Auto-generated method stub
		return cursoRepository.findAll();
	}

	
	@Transactional(readOnly = true)
	@Override
	public List<Curso> findByNumNivel(Integer numNivel) throws Exception {
		// TODO Auto-generated method stub
		return cursoRepository.findByNumNivel(numNivel);
	}

}
