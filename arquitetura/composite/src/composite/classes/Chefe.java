package composite.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Classe composite
public class Chefe extends Funcionario{
	private String nome;
	private Collection<Funcionario> subordinados;
	
	
	public Chefe() {
		subordinados = new ArrayList<Funcionario>();
	}
	
	@Override
	public double calcularSalarioAgregado() {
		double valorAgregado = this.salario;
		Iterator<Funcionario> iterSubordinados = subordinados.iterator();
		
		while(iterSubordinados.hasNext()) {
			Funcionario funcionario = iterSubordinados.next();
			valorAgregado += funcionario.calcularSalarioAgregado();
		}
		
		return valorAgregado;
	}
	
	@Override
	public void add(Funcionario funcionario) {
		subordinados.add(funcionario);
	}
	
	@Override
	public void remove(Funcionario funcionario) {
		subordinados.remove(funcionario);
	}
}
