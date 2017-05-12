package enums;

public enum Sexo {
	MASCULINO("Masculino"), FEMININO("Feminino");
	private String sexo;
	
	Sexo(String valor)
	{
		setSexo(valor);
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
}
