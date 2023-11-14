package F1;

import java.util.Random;

public final class Equipe04 extends Automóvel {

	public boolean naoTrocouPneus;

	public Equipe04(String marcaDoCarro, int anoFabricacao, String nomeEquipe, String nomePiloto, String cor) {
		super(marcaDoCarro, anoFabricacao, nomeEquipe, nomePiloto, cor);
		this.naoTrocouPneus = true;
	}

	@Override
	public void acelerar() {
		if (this.marcaDoCarro == "Jordan" && this.nomePiloto == "Rubens Barrichello") {

			System.out.println("Acelerando...300 km/h");
		}

	}

	@Override
	public void freiar() {
		System.out.println("Freio começa a apresentar problemas...");
	}

	@Override
	public void parar() {
		System.out.println("1x parada no box para tentar resolver o problema dos freios...");
	}

	@Override
	public void trocarPneu() {
		Random random = new Random();
		this.naoTrocouPneus = random.nextBoolean();

		if (this.naoTrocouPneus) {
			System.out.println("Esquece de trocar os pneus...");
		} else {
			System.out.println("Troca os pneus...tenta garantir o 15º lugar!");
		}
	}

	@Override
	public String toString() {
		return "Equipe04 => [marcaDoCarro=" + marcaDoCarro + ", anoFabricacao=" + anoFabricacao + ", nomeEquipe="
				+ nomeEquipe + ", nomePiloto=" + nomePiloto + ", cor=" + cor + "]";
	}

	public void acidentou() {
		Random random = new Random();
		this.naoTrocouPneus = random.nextBoolean();
		
		if (this.naoTrocouPneus) {
			System.out.println("Bateu de frente no guard rail...O carro está em chamas!");
		}else {
			System.out.println("Trocou os pneus, não acidentou e garantiu o 15º lugar!");
		}
	}

}
