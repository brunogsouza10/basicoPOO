package heranca; // de diferença

public final class Professor extends Pessoa {// subclasse

	private int especialidade;
	private double salario;

	public void receberAumento() {

	}

	public int getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(int especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
