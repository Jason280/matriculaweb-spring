package pe.edu.upc.matriculaweb.services.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.matriculaweb.models.entities.CarreraUniversitaria;
import pe.edu.upc.matriculaweb.models.repositories.CarreraUniversitariaRepository;
import pe.edu.upc.matriculaweb.services.CarreraUniversitariaService;

@Service
public class CarreraUniversitariaServiceImpl implements CarreraUniversitariaService, Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CarreraUniversitariaRepository carreraUniversitariaRepository;

	
	@Transactional
	@Override
	public CarreraUniversitaria save(CarreraUniversitaria entity) throws Exception {
		// TODO Auto-generated method stub
		return carreraUniversitariaRepository.save(entity);
	}

	@Transactional
	@Override
	public CarreraUniversitaria update(CarreraUniversitaria entity) throws Exception {
		// TODO Auto-generated method stub
		return carreraUniversitariaRepository.save(entity);
	}

	@Transactional(readOnly = true)
	@Override
	public long count() throws Exception {
		// TODO Auto-generated method stub
		return carreraUniversitariaRepository.count();
	}

	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		carreraUniversitariaRepository.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<CarreraUniversitaria> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return carreraUniversitariaRepository.findById(id);
	}

	
	@Transactional(readOnly = true)
	@Override
	public List<CarreraUniversitaria> findAll() throws Exception {
		// TODO Auto-generated method stub
		return carreraUniversitariaRepository.findAll();
	}

	
	@Transactional(readOnly = true)
	@Override
	public Optional<CarreraUniversitaria> findByNomCarrera(String nomCarrera) throws Exception {
		// TODO Auto-generated method stub
		return carreraUniversitariaRepository.findByNomCarrera(nomCarrera);
	}

}
