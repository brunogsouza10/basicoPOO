package F1;

import java.util.Random;

public final class Equipe03 extends Automóvel {

	public boolean chegouEmPrimeiro;
	public boolean rodouNaSubidaDaReta;

	public Equipe03(String marcaDoCarro, int anoFabricacao, String nomeEquipe, String nomePiloto, String cor) {
		super(marcaDoCarro, anoFabricacao, nomeEquipe, nomePiloto, cor);
		this.chegouEmPrimeiro = false;
		this.rodouNaSubidaDaReta = false;

	}

	@Override
	public void acelerar() {
		if (this.marcaDoCarro == "Mclaren" && this.nomePiloto == "Ayrton Senna") {
			System.out.println("Acelerando na chuva...385 km/h");
		}

	}

	@Override
	public void freiar() {
		System.out.println("freando no limite das curvas...");

	}

	@Override
	public void parar() {
		System.out.println("Parou uma vez ");

	}

	@Override
	public void trocarPneu() {
		System.out.println("Colocou pneus de chuva");

	}

	@Override
	public String toString() {
		return "Equipe03=> [marcaDoCarro=" + marcaDoCarro + ", anoFabricacao=" + anoFabricacao + ", nomeEquipe="
				+ nomeEquipe + ", nomePiloto=" + nomePiloto + ", cor=" + cor + "]";
	}

	public void subidaReta() {
		Random random = new Random();
		this.rodouNaSubidaDaReta = random.nextBoolean();

		if (this.nomePiloto == "Ayrton Senna" && this.rodouNaSubidaDaReta == true) {
			System.out.println("Rodou na subida da reta, devido a pista molhada...");

		} else if (this.nomePiloto == "Ayrton Senna" && this.rodouNaSubidaDaReta == false) {
			System.out.println("Está próximo de cruzar a linha de chegada!!");

		} else {
			System.out.println("Piloto não encontrado.");
		}

	}

	public void aconteceuNaUltimaVolta() {
		Random random = new Random();
		this.chegouEmPrimeiro = random.nextBoolean();

		if (this.nomePiloto == "Ayrton Senna" && this.chegouEmPrimeiro == true) {
			System.out.println("Cruzou a linha de chegada...Música da vitória...O campeão comemora!!");

		} else if (this.nomePiloto == "Ayrton Senna" && this.chegouEmPrimeiro == false) {
			System.out.println(this.nomePiloto + " perdeu a corrida!");
		} else {
			System.out.println("Piloto não encontrado.");
		}
	}

}
