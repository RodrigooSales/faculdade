package aulaula.formas;

import aulaula.abstratas.Forma;

public class Retangulo extends Forma{
	public double altura;
	public double largura;
	
	public Retangulo(String cor, double altura, double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		this.largura = largura;
	}


	@Override
	public double calculaArea() {
		return altura * largura;
	}

}
