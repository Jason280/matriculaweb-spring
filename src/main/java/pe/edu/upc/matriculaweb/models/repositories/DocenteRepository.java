package pe.edu.upc.matriculaweb.models.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upc.matriculaweb.models.entities.Docente;

public interface DocenteRepository extends JpaRepository<Docente, Integer>{
	

}
