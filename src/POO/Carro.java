package POO;

public class Carro extends Automovel{
	
	
	private String motorizacao;
	private Integer capacidade;
	private String opicionais;
	
	public Carro(String marca, String modelo, Integer ano, String motorizacao, Integer capacidade, String opicionais) {
		super(marca, modelo, ano);
		// TODO Auto-generated constructor stub
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(getAno());
		this.motorizacao = motorizacao;
		this.capacidade = capacidade;
		this.opicionais = opicionais;
	}

	public String getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(String motorizacao) {
		this.motorizacao = motorizacao;
	}

	public Integer getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

	public String getOpicionais() {
		return opicionais;
	}

	public void setOpicionais(String opicionais) {
		this.opicionais = opicionais;
	}
	public void imprimeCarro() {
		System.out.println("-------------------------");
		System.out.println("Descrição do carro: ");
		this.imprimirsuperclasse();
		System.out.println("Motorização: " + getMotorizacao() + ", Opicionais: " + getOpicionais() + 
				", Capacidade: " + getCapacidade() + " pessoas");
	
	}
	
	

}
