package composite.classes;

public abstract class Funcionario {
	protected String nome; 
	protected double salario;
	
	public abstract double calcularSalarioAgregado();
	
	public abstract void add(Funcionario funcionario);
	public abstract void remove(Funcionario funcionario);

}
