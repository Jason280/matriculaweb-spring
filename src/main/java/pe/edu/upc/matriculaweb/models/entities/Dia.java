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
@Table(name = "dias")
public class Dia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NDia", length = 9, nullable = false)
	private String nDia;
	
	@OneToMany(mappedBy = "dia")
	private List<DetalleHorario> detalles_horarios;
	
	public Dia() {
		detalles_horarios=new ArrayList<DetalleHorario>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getnDia() {
		return nDia;
	}

	public void setnDia(String nDia) {
		this.nDia = nDia;
	}

	public List<DetalleHorario> getDetalles_horarios() {
		return detalles_horarios;
	}

	public void setDetalles_horarios(List<DetalleHorario> detalles_horarios) {
		this.detalles_horarios = detalles_horarios;
	}

	
	
	
}
