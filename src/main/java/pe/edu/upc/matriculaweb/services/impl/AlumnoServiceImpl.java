package pe.edu.upc.matriculaweb.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.matriculaweb.models.entities.Alumno;
import pe.edu.upc.matriculaweb.models.repositories.AlumnoRepository;
import pe.edu.upc.matriculaweb.services.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private AlumnoRepository alumnoRepository;

	
	@Transactional
	@Override
	public Alumno save(Alumno entity) throws Exception {
		// TODO Auto-generated method stub
		return alumnoRepository.save(entity);
	}

	@Transactional
	@Override
	public Alumno update(Alumno entity) throws Exception {
		// TODO Auto-generated method stub
		return alumnoRepository.save(entity);
		
	}

	@Transactional(readOnly = true)
	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return alumnoRepository.count();
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		alumnoRepository.deleteById(id);
	}

	@Transactional(readOnly = true)	
	@Override
	public Optional<Alumno> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Alumno> findAll() throws Exception {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Alumno> findByBitHabilitado(Boolean bitHabilitado) throws Exception {
		// TODO Auto-generated method stub
		return alumnoRepository.findByBitHabilitado(bitHabilitado);
	}
	
	

}
