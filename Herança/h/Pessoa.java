package heranca;

public abstract class Pessoa {// Superclasse

//CLASSE ABSTRATA - NAO PODE SER INSTANCIADA. SÓ PODE SERVIR COMO PROGENITORA	
//NAO PODE GERAR OBJETOS.

	private String nome;
	private int idade;
	private String sexo;

	public final void fazerAniversario() {// NAO PODE SER SOBRESCRITO.@Override

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

}
