
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Funcionário f = new Funcionário();	
	
	f.setNome("Marcos");
	f.setSalario(1000);
	f.aumentaSalario();
	System.out.println("Funcionário---> "  + f.getNome() + " Salário "  + f.getSalario());
	
	Gerente g = new Gerente();
	g.setNome("Manuel");
	g.setSalario(2000);
	g.aumentaSalario();
	System.out.println("Gerente--->  " +  g.getNome() + " Salário "  + g.getSalario());
	
	Programador p = new Programador();
	p.setNome("João");
	p.setSalario(800);
	p.aumentaSalario();
	System.out.println("Pogramador---> " + p.getNome() + " Salário "  + p.getSalario());
	
	AnalistadeSistema A = new AnalistadeSistema();
	A.setNome("Jefferson");
	A.setSalario(300000);
	A.aumentaSalario();
	System.out.println("Analista---> " + A.getNome() + " Salário "  + A.getSalario());

	
	}	
	  }

	


