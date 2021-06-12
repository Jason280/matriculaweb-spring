package pe.edu.upc.matriculaweb.models.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.matriculaweb.models.entities.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad, Integer>{

	Optional<Especialidad> findByNomEspecialidad(String nomEspecialidad) throws Exception;
}
