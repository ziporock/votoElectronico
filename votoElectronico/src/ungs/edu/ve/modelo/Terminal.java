package ungs.edu.ve.modelo;

import java.io.Serializable;

public class Terminal implements Serializable{

	private static final long serialVersionUID = 1966330467723672193L;
	private Long id;
	private String codigo;
	private String descripcion;
	
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
