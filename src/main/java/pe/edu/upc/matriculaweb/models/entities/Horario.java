package pe.edu.upc.matriculaweb.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "horarios")
public class Horario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "HoraInicio", length = 5, nullable = false)
	private String horaInicio;
	
	@Column(name = "HoraFin", length = 5, nullable = false)
	private String horaFin;
	
	@OneToMany(mappedBy = "horario")
	private List<DetalleHorario> detalles_horarios;
	
	public Horario() {
		
		detalles_horarios=new ArrayList<DetalleHorario>(); 
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	public List<DetalleHorario> getDetalles_horarios() {
		return detalles_horarios;
	}

	public void setDetalles_horarios(List<DetalleHorario> detalles_horarios) {
		this.detalles_horarios = detalles_horarios;
	}

	
	
	
}
