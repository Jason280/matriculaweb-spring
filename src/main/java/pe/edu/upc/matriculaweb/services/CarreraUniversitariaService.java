package pe.edu.upc.matriculaweb.services;

import java.util.Optional;

import pe.edu.upc.matriculaweb.models.entities.CarreraUniversitaria;

public interface CarreraUniversitariaService extends CrudService<CarreraUniversitaria, Integer> {

	Optional<CarreraUniversitaria> findByNomCarrera(String nomCarrera) throws Exception;

}
