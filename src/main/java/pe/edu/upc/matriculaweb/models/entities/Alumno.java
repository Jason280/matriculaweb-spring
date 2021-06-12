package pe.edu.upc.matriculaweb.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "persona_id")
	private Persona persona;
	
	@Column(name = "NumCiclo", length = 2,nullable = false)
	private Integer numCiclo;
	
	@Column(name = "BitHabilitado", nullable = false)
	private Boolean bitHabilitado;
	
	@ManyToOne
	@JoinColumn(name = "carrera_universitaria_id")
	private CarreraUniversitaria carreraUniversitaria;
	
	public Alumno() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Integer getNumCiclo() {
		return numCiclo;
	}

	public void setNumCiclo(Integer numCiclo) {
		this.numCiclo = numCiclo;
	}
	
	

	public Boolean getBitHabilitado() {
		return bitHabilitado;
	}

	public void setBitHabilitado(Boolean bitHabilitado) {
		this.bitHabilitado = bitHabilitado;
	}

	public CarreraUniversitaria getCarreraUniversitaria() {
		return carreraUniversitaria;
	}

	public void setCarreraUniversitaria(CarreraUniversitaria carreraUniversitaria) {
		this.carreraUniversitaria = carreraUniversitaria;
	}

	
	
	
	
}
