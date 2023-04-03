package aulaula.abstratas;

public abstract class Forma {
	protected String cor;
	
	public Forma(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public abstract double calculaArea();
}
