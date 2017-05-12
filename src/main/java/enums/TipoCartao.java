package enums;

public enum TipoCartao {
	VERMELHO("Vermelho"), AMARELO("Amarelo");
	public String tipoCartao;

	TipoCartao(String valor) {
		tipoCartao = valor;
	}

	public String getTipo() {
		return tipoCartao;
	}

}