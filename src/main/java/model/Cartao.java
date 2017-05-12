package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import enums.*;
@Entity
public class Cartao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoCartao;
	@ManyToOne
	private Inscrito inscrito;
	private TipoCartao tipo;
	private int Tempo;
	
	public Inscrito getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}
	public TipoCartao getTipo() {
		return tipo;
	}
	public void setTipo(TipoCartao tipo) {
		this.tipo = tipo;
	}
	public int getTempo() {
		return Tempo;
	}
	public void setTempo(int tempo) {
		Tempo = tempo;
	}
	public int getCodigoCartao() {
		return codigoCartao;
	}
	public void setCodigoCartao(int codigoCartao) {
		this.codigoCartao = codigoCartao;
	}
	
}
