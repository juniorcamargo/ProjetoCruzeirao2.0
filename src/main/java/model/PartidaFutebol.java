package model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
public class PartidaFutebol{

	@OneToMany( targetEntity=Gol.class )
	private ArrayList<Gol> golsMandantes= new ArrayList<Gol>();
	
	@OneToMany( targetEntity=Gol.class )
	private ArrayList<Gol> golsVisitantes = new ArrayList<Gol>();
	
	@OneToMany( targetEntity=Cartao.class )
	private ArrayList<Cartao> cartoesMandante = new ArrayList<Cartao>();
	
	@OneToMany( targetEntity=Cartao.class )
	private ArrayList<Cartao> cartoesVisitante = new ArrayList<Cartao>();
	

	public ArrayList<Gol> golsPenaliMandante() {
		ArrayList<Gol> result = new ArrayList<Gol>();
		for (Gol gol : golsMandantes) {
			if(gol.isPenalti())
				result.add(gol);
		}
		return result;
	}	
	
	public ArrayList<Gol> golsPenaliVisitante() {
		ArrayList<Gol> result = new ArrayList<Gol>();
		for (Gol gol : golsVisitantes) {
			if(gol.isPenalti())
				result.add(gol);
		}
		return result;
	}	
	
	public ArrayList<Gol> getGolsMandantes() {
		return golsMandantes;
	}
	public void setGolsMandantes(ArrayList<Gol> golsMandantes) {
		this.golsMandantes = golsMandantes;
	}
	public ArrayList<Gol> getGolsVisitantes() {
		return golsVisitantes;
	}
	public void setGolsVisitantes(ArrayList<Gol> golsVisitantes) {
		this.golsVisitantes = golsVisitantes;
	}
	public ArrayList<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}
	public void setCartoesMandante(ArrayList<Cartao> cartoesMandante) {
		this.cartoesMandante = cartoesMandante;
	}
	public ArrayList<Cartao> getCartoesVisitante() {
		return cartoesVisitante;
	}
	public void setCartoesVisitante(ArrayList<Cartao> cartoesVisitante) {
		this.cartoesVisitante = cartoesVisitante;
	}
}
