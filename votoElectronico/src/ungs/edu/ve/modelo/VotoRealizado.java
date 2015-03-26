package ungs.edu.ve.modelo;

import java.io.Serializable;

public class VotoRealizado implements Serializable{

	private Votante votante;
	private Estado estado;
	private Terminal terminal;
	public Votante getVotante() {
		return votante;
	}
	public void setVotante(Votante votante) {
		this.votante = votante;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Terminal getTerminal() {
		return terminal;
	}
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	
	
	
}
