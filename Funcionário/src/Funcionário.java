
public class Funcion�rio {

	private String Nome;
	private double Salario;
	
	// construtor
	
Funcion�rio(){
	

}

public String getNome() {
	return Nome;
}

public void setNome(String nome) {
	this.Nome = nome;
}

public double getSalario() {
	return Salario;
}

public void setSalario(double salario) {
	this.Salario = salario;
}
public void aumentaSalario(){
	setSalario(getSalario() * 1.50);
}

}
