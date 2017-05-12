package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Inscrito implements Serializable{

	private static final long serialVersionUID = 1L;
	// TODO private ENUM tipo
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoInscrito;
	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Inscricao inscricao;
	
	private boolean aceiteUsuario;
	private boolean suspensoJogos;
	private boolean inscricaoValidada;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	public boolean isAceiteUsuario() {
		return aceiteUsuario;
	}

	public void setAceiteUsuario(boolean aceiteUsuario) {
		this.aceiteUsuario = aceiteUsuario;
	}

	public boolean isSuspensoJogos() {
		return suspensoJogos;
	}

	public void setSuspensoJogos(boolean suspensoJogos) {
		this.suspensoJogos = suspensoJogos;
	}

	public boolean isInscricaoValidada() {
		return inscricaoValidada;
	}

	public void setInscricaoValidada(boolean inscricaoValidada) {
		this.inscricaoValidada = inscricaoValidada;
	}

	public int getCodigoInscrito() {
		return codigoInscrito;
	}

	public void setCodigoInscrito(int codigoInscrito) {
		this.codigoInscrito = codigoInscrito;
	}

}
