package F1;

import java.util.Random;

public final class Equipe02 extends Automóvel {

	public boolean abandonou;

	public Equipe02(String marcaDoCarro, int anoFabricacao, String nomeEquipe, String nomePiloto, String cor) {
		super(marcaDoCarro, anoFabricacao, nomeEquipe, nomePiloto, cor);
		this.abandonou = false;

	}

	@Override
	public void acelerar() {
		if (this.marcaDoCarro == "Williams" && this.nomePiloto == "Leandro Gomes") {
			System.out.println("Acelerando... 400km/h");
		}
	}

	@Override
	public void freiar() {
		System.out.println("freando em cima das curvas e zebras...");
	}

	@Override
	public void parar() {
		System.out.println("Para 2x durante a corrida...");
	}

	@Override
	public void trocarPneu() {
		System.out.println("Troca pneu uma única vez...");
	}

	@Override
	public String toString() {
		return "Equipe02=> [marcaDoCarro=" + marcaDoCarro + ", anoFabricacao=" + anoFabricacao + ", nomeEquipe="
				+ nomeEquipe + ", nomePiloto=" + nomePiloto + ", cor=" + cor + "]";
	}

	public void abandonarCorrida() {
		
		Random random = new Random();
		this.abandonou = random.nextBoolean();
		if (this.abandonou) {
		
		System.out.println("bateu e abandonou a corrida...por estar acima da velocidade e freiar poucas vezes!");
	} else {
		System.out.println("Continua acelerando feito doido...");
	}
	}
}
