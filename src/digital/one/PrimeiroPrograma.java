package digital.one;
import digital.innovation.one.SayajinJava;

public class  PrimeiroPrograma {

	public static void main(String[] args) {
		SayajinJava sayajinjava = new SayajinJava();
		Livros livros = new Livros();
		
		System.out.println(livros);		
		System.out.println(sayajinjava);
		
		}

}


class Livros {
	private String nome;
	private String npag;
}
