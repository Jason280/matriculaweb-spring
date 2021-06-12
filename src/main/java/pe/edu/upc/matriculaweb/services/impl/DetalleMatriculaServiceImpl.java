package pe.edu.upc.matriculaweb.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.matriculaweb.models.entities.DetalleMatricula;
import pe.edu.upc.matriculaweb.models.repositories.DetalleMatriculaRepository;
import pe.edu.upc.matriculaweb.services.DetalleMatriculaService;

@Service
public class DetalleMatriculaServiceImpl implements DetalleMatriculaService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private DetalleMatriculaRepository detalleMatriculaRepository;
	
	@Transactional
	@Override
	public DetalleMatricula save(DetalleMatricula entity) throws Exception {
		// TODO Auto-generated method stub
		return detalleMatriculaRepository.save(entity);
	}

	@Transactional
	@Override
	public DetalleMatricula update(DetalleMatricula entity) throws Exception {
		// TODO Auto-generated method stub
		return detalleMatriculaRepository.save(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return detalleMatriculaRepository.count();
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		detalleMatriculaRepository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<DetalleMatricula> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return detalleMatriculaRepository.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<DetalleMatricula> findAll() throws Exception {
		// TODO Auto-generated method stub
		return detalleMatriculaRepository.findAll();
	}

}
