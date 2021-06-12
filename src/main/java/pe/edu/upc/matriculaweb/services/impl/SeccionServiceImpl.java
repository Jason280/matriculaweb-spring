package pe.edu.upc.matriculaweb.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.matriculaweb.models.entities.Seccion;
import pe.edu.upc.matriculaweb.models.repositories.SeccionRepository;
import pe.edu.upc.matriculaweb.services.SeccionService;

@Service
public class SeccionServiceImpl implements SeccionService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SeccionRepository seccionRepository;
	
	@Transactional
	@Override
	public Seccion save(Seccion entity) throws Exception {
		// TODO Auto-generated method stub
		return seccionRepository.save(entity);
	}

	@Transactional
	@Override
	public Seccion update(Seccion entity) throws Exception {
		// TODO Auto-generated method stub
		return seccionRepository.save(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return seccionRepository.count();
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		seccionRepository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Seccion> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return seccionRepository.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Seccion> findAll() throws Exception {
		// TODO Auto-generated method stub
		return seccionRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Seccion> findByTxSeccion(String txSeccion) throws Exception {
		// TODO Auto-generated method stub
		return seccionRepository.findByTxSeccion(txSeccion);
	}

}
