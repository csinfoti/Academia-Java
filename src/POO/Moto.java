package POO;

public class Moto extends Automovel{
	
	private Integer cilindrada;
	private String freio;
	
	public Moto(String marca, String modelo, Integer ano, Integer cilindrada, String freio) {
		super(marca, modelo, ano);
		// TODO Auto-generated constructor stub
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.cilindrada = cilindrada;
		this.freio = freio;
	}
	
	

	public Integer getCilindrada() {
		return cilindrada;
	}



	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}



	public String getFreio() {
		return freio;
	}



	public void setFreio(String freio) {
		this.freio = freio;
	}



	public void imprimeMoto() {
		System.out.println("-------------------------");
		System.out.println("Descrição da moto: ");
		this.imprimirsuperclasse();
		System.out.println("Cilindrada: " + getCilindrada() + ", Freios " + getFreio());
	
	}
	

}
