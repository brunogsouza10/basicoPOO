package F1;

public final class Equipe01 extends Automóvel {

	public Equipe01(String marcaDoCarro, int anoFabricacao, String nomeEquipe, String nomePiloto, String cor) {
		super(marcaDoCarro, anoFabricacao, nomeEquipe, nomePiloto, cor);

	}

	@Override
	public void acelerar() {
		if (this.marcaDoCarro == "Ferrari" && this.nomePiloto == "Bruno Gomes") {

			System.out.println("Acelerando...370 km/h");
		}
	}

	@Override
	public void freiar() {
		System.out.println("Freando...");
	}

	@Override
	public void parar() {
		System.out.println("parou o carro...");
	}

	@Override
	public void trocarPneu() {
		System.out.println("Acionou trocar pneus...se dirigindo para os boxes!");

	}

	@Override
	public String toString() {
		return "Equipe01=> [marcaDoCarro=" + marcaDoCarro + ", anoFabricacao=" + anoFabricacao + ", nomeEquipe="
				+ nomeEquipe + ", nomePiloto=" + nomePiloto + ", cor=" + cor + "]";
	}

}
