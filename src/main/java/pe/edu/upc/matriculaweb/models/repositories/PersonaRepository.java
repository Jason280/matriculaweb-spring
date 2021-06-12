package pe.edu.upc.matriculaweb.models.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.matriculaweb.models.entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

	Optional<Persona> findByBitAdmin(Boolean bitAdmin) throws Exception;
}
