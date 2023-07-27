package POO;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//implementação parametros publicas
		//Automovel veiculo = new Automovel("Chevrolet", "Kadett", 1994);
		//System.out.println(veiculo.modelo);
		
		//implementação parametros private
		Automovel veiculo = new Automovel(null, null, null);
		Moto moto = new Moto ("Honda","Twister", 2016, 250, "ABS");
		Carro carro = new Carro("Chevrolet", "Kadett", 1997, "1.8", 4, "GL");
		veiculo.setAno(1994);
		veiculo.setMarca("Chevrolet");
		veiculo.setModelo("Kadett");
		veiculo.imprimirsuperclasse();
		System.out.println("-------------------------");
		System.out.println("Teste método da superclasse");
		moto.imprimirsuperclasse();
		moto.imprimeMoto();
		System.out.println("-------------------------");
		System.out.println("Teste método segunda classe criada:");
		carro.imprimeCarro();
	}

}
