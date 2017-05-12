package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Juiz implements Serializable {
	private static final long serialVersionUID = 1L;
	// TODO private ENUM tipo
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoJuiz;
	//TODO private ENum TIPO;
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getCodigoJuiz() {
		return codigoJuiz;
	}

	public void setCodigoJuiz(int codigoJuiz) {
		this.codigoJuiz = codigoJuiz;
	}
	
	
}
