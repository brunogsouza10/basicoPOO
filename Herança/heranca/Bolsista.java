package heranca;

public final class Bolsista extends Aluno {// final pq essa classe final nao tera filhas

	private int bolsa;

	public void RenovarBolsa() {
		System.out.println("Renovando bolsa de " + getNome());

	}

	@Override // sobrepoe quando é preciso utilizar o msm metodo com alguma alteracao =
				// POLIMORFISMO
	public void PagarMensalidade() {
		System.out.println(this.getNome() + "é bolsista.Pagamento facilitado");
	}

	public int getBolsa() {
		return bolsa;
	}

	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
}
