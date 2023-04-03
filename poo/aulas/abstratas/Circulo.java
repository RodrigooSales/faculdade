package aulaula.formas;

import aulaula.abstratas.Forma;

public class Circulo extends Forma{
	public double raio;

	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * raio * raio;
	}
	
	
}
