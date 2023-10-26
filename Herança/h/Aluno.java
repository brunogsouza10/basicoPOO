package heranca;//heranca para diferenca

public class Aluno extends Pessoa {
//aluno tende ser abstracao das duas filhas bolsista e tecnico, enquanto pessoa é abstracao de aluno
	private int matricula;
	private String curso;

	public void PagarMensalidade() {
		System.out.println("Pagando mensalidade de aluno: " + getNome());

	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
