package pe.edu.upc.matriculaweb.models.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_horarios")
@IdClass(DetalleHorarioId.class)
public class DetalleHorario {

	
	@Id
	@ManyToOne
	@JoinColumn(name="horario_id")
	private Horario horario;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "dia_id")
	private Dia dia;
	
	@Id
	@ManyToOne
	@JoinColumn(name="curso_id")
	private Curso curso;

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
}
