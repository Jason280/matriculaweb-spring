package pe.edu.upc.matriculaweb.models.entities;

import java.io.Serializable;
import java.util.Objects;


public class DetalleHorarioId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer dia;
	private Integer horario;
	private Integer curso;
	
	public DetalleHorarioId() {
		
	}
	
	public DetalleHorarioId(Integer dia, Integer horario, Integer curso) {
	
		super();
		this.dia=dia;
		this.curso=curso;
		this.horario=horario;
		
	}

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getHorario() {
		return horario;
	}

	public void setHorario(Integer horario) {
		this.horario = horario;
	}

	public Integer getCurso() {
		return curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(horario,dia,curso);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
        if (obj == null || getClass() != obj.getClass()) 
        	return false;
        DetalleHorarioId detalleHorarioId = (DetalleHorarioId) obj;
        if (this.horario != detalleHorarioId.horario) 
        	return false;
        if (this.dia != detalleHorarioId.dia) 
        	return false;
        return this.curso == detalleHorarioId.curso;
	}
	
	
	
	
}
