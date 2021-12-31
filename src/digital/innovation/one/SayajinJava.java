package digital.innovation.one;


import java.util.Objects;

/*author: Java Cognizant Developer */
public class SayajinJava {
public static void main(String[] args) {
	}
	
	private String nome;
	private String raça;
	private Integer poder;
	private Integer idade;
	
	
	
	public SayajinJava(String nome, String raça, Integer poder, Integer idade) {
		this.nome = nome;
		this.raça = raça;
		this.poder = poder;
		this.idade = idade;
	}


	public SayajinJava() {
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getRaça() {
		return raça;
	}


	public void setRaça(String raça) {
		this.raça = raça;
	}


	public Integer getPoder() {
		return poder;
	}


	public void setPoder(Integer poder) {
		this.poder = poder;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idade, nome, poder, raça);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SayajinJava other = (SayajinJava) obj;
		return Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome)
				&& Objects.equals(poder, other.poder) && Objects.equals(raça, other.raça);
	}


	@Override
	public String toString() {
		return "SayajinJava [nome=" + nome + ", raça=" + raça + ", poder=" + poder + ", idade=" + idade + "]";
	}
	
	
	
	
	
	
	
}