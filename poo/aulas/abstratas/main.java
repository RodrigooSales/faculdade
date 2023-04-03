package aulaula;

import aulaula.formas.Retangulo;

public class main {
	public static void main(String[] args) {
		System.out.println("teste");
		
		Retangulo retangulo = new Retangulo("vermelho", 10, 20);
		
		System.out.println(retangulo.calculaArea());
	}
}
