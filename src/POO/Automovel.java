package POO;

//estrutura da classe
public class Automovel {
	private String marca;
	private String modelo;
	private Integer ano;
	
	//construtor
	public  Automovel (String marca, String modelo, Integer ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	public void imprimirsuperclasse() {
		System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
	}

}
