package pe.edu.upc.matriculaweb.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.matriculaweb.models.entities.Persona;
import pe.edu.upc.matriculaweb.models.repositories.PersonaRepository;
import pe.edu.upc.matriculaweb.services.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private PersonaRepository personaRepository;
	
	
	
	@Transactional
	@Override
	public Persona save(Persona entity) throws Exception {
		// TODO Auto-generated method stub
		return personaRepository.save(entity);
	}

	@Transactional
	@Override
	public Persona update(Persona entity) throws Exception {
		// TODO Auto-generated method stub
		return personaRepository.save(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return personaRepository.count();
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		personaRepository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Persona> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return personaRepository.findById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Persona> findAll() throws Exception {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Persona> findByBitAdmin(Boolean bitAdmin) throws Exception {
		// TODO Auto-generated method stub
		return personaRepository.findByBitAdmin(bitAdmin);
	}

}
