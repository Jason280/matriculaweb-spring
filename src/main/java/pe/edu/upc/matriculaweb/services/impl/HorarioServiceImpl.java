package pe.edu.upc.matriculaweb.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.matriculaweb.models.entities.Horario;
import pe.edu.upc.matriculaweb.models.repositories.HorarioRepository;
import pe.edu.upc.matriculaweb.services.HorarioService;

@Service
public class HorarioServiceImpl implements HorarioService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private HorarioRepository horarioRepository;

	@Transactional
	@Override
	public Horario save(Horario entity) throws Exception {
		// TODO Auto-generated method stub
		return horarioRepository.save(entity);
	}

	@Transactional
	@Override
	public Horario update(Horario entity) throws Exception {
		// TODO Auto-generated method stub
		return horarioRepository.save(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return horarioRepository.count();
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		horarioRepository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Horario> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return horarioRepository.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Horario> findAll() throws Exception {
		// TODO Auto-generated method stub
		return horarioRepository.findAll();
	}

}
