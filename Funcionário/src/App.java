
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Funcion�rio f = new Funcion�rio();	
	
	f.setNome("Marcos");
	f.setSalario(1000);
	f.aumentaSalario();
	System.out.println("Funcion�rio---> "  + f.getNome() + " Sal�rio "  + f.getSalario());
	
	Gerente g = new Gerente();
	g.setNome("Manuel");
	g.setSalario(2000);
	g.aumentaSalario();
	System.out.println("Gerente--->  " +  g.getNome() + " Sal�rio "  + g.getSalario());
	
	Programador p = new Programador();
	p.setNome("Jo�o");
	p.setSalario(800);
	p.aumentaSalario();
	System.out.println("Pogramador---> " + p.getNome() + " Sal�rio "  + p.getSalario());
	
	AnalistadeSistema A = new AnalistadeSistema();
	A.setNome("Jefferson");
	A.setSalario(300000);
	A.aumentaSalario();
	System.out.println("Analista---> " + A.getNome() + " Sal�rio "  + A.getSalario());

	
	}	
	  }

	


