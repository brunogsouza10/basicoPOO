package heranca;

public class Ações {

	public static void main(String[] args) {

		/*
		 * Visitante v1 = new Visitante();
		 * 
		 * v1.setNome("Hitler"); v1.setIdade(30); v1.setSexo("M");
		 * System.out.println(v1.toString());
		 */

		/*
		 * Aluno a1 = new Aluno(); a1.setNome("Antonio"); a1.setSexo("M");
		 * a1.setIdade(18); a1.setMatricula(666); a1.setCurso("ADS");
		 * a1.PagarMensalidade();
		 */

		/*
		 * Bolsista b1 = new Bolsista(); b1.setMatricula(1112); b1.setNome("Ojuara");
		 * b1.setIdade(17); b1.setCurso("Redes"); b1.setSexo("Masculino");
		 * b1.setBolsa(12); System.out.println(b1.toString());
		 * System.out.println(b1.getCurso());
		 */

		/*
		 * Professor p1 = new Professor(); p1.setNome("Geny"); p1.setIdade(79);
		 * p1.setEspecialidade(10); p1.setSalario(10.000); p1.setSexo("Feminino");
		 * System.out.println(p1.toString());
		 */

		Técnico t1 = new Técnico();
		t1.setNome("Napoleao");
		System.out.println(t1.getNome());
		t1.setRegistroProfissional(1789);
		System.out.println(t1.getRegistroProfissional());
		t1.praticar();

	}

}
