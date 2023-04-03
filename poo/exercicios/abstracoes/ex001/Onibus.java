
public class Onibus extends Veiculo implements TransportePublico{
	
	public int passageiros;
	
	
	public Onibus(int passageiros) {
		super();
		this.passageiros = passageiros;
	}

	@Override
	public void pegarPassageiro() {
		System.out.println("pegando passageiro...");
		passageiros += 1;
		System.out.println("O numero de passageiros é de: " + passageiros);
		
	}

	@Override
	public void acelerar() {
		System.out.println("O onibus está acelerando...");
		
	}
	
}
