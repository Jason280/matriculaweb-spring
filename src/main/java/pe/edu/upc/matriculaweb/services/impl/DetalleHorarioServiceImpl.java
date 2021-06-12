package pe.edu.upc.matriculaweb.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.matriculaweb.models.entities.DetalleHorario;
import pe.edu.upc.matriculaweb.models.repositories.DetalleHorarioRepository;
import pe.edu.upc.matriculaweb.services.DetalleHorarioService;

@Service
public class DetalleHorarioServiceImpl implements DetalleHorarioService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private DetalleHorarioRepository detalleHorarioRepository;

	@Transactional
	@Override
	public DetalleHorario save(DetalleHorario entity) throws Exception {
		// TODO Auto-generated method stub
		return detalleHorarioRepository.save(entity);
	}

	@Transactional
	@Override
	public DetalleHorario update(DetalleHorario entity) throws Exception {
		// TODO Auto-generated method stub
		return detalleHorarioRepository.save(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return detalleHorarioRepository.count();
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		detalleHorarioRepository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<DetalleHorario> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return detalleHorarioRepository.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<DetalleHorario> findAll() throws Exception {
		// TODO Auto-generated method stub
		return detalleHorarioRepository.findAll();
	}

}
