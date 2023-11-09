package polimorfismos;

import java.util.Random;
import java.util.Scanner;

public final class Palmeiras extends TimeDeFutebol {
//FILHAS, FOLHAS

	@Override
	public void marcarPartida() {

		Scanner scanner = new Scanner(System.in);

		int numeroJogo;

		System.out.println("***MARCAR PARTIDAS***");
		System.out.println("[Jogo 2] - Palmeiras X Santos");
		System.out.println("[Jogo 4] - Palmeiras X Corinthians");
		System.out.println("[Jogo 5] - SPFC X Palmeiras");
		System.out.println("--------------------------------------");
		System.out.println("Escolha o número do jogo a ser marcado: ");
		numeroJogo = scanner.nextInt();

		if (numeroJogo == 2) {
			System.out.println("Jogam hoje: ");
			System.out.println("[Jogo 2] - Palmeiras X Santos");
			ganhouOuPerdeu();

		} else if (numeroJogo == 4) {
			System.out.println("Jogam hoje: ");
			System.out.println("[Jogo 4] - Palmeiras X Corinthians");
			ganhouOuPerdeu();

		} else if (numeroJogo == 5) {
			System.out.println("Jogam hoje: ");
			System.out.println("[Jogo 5] - SPFC X Palmeiras");
			ganhouOuPerdeu();

		} else {
			System.out.println("-----------------------------------------------------");
			System.out.println("Erro. Número de jogo ainda não previsto no calendário.");
			System.exit(numeroJogo);
		}

		Random random = new Random();
		boolean palmeirasGanhou = random.nextBoolean();

		if (palmeirasGanhou) {
			System.out.println("------------------------------");
			System.out.println("O Palmeiras ganhou a partida!");
		} else {
			System.out.println("------------------------------");
			System.out.println("O Palmeiras perdeu a partida!");
		}

	}

	@Override
	public void jogar() {
		this.nomeTime = "Palmeiras";
		this.numeroDeJogadores = 11;
		this.cores = " Verde e Branca";

		System.out.println("O " + this.nomeTime + " está em campo com seus " + this.numeroDeJogadores + " jogadores!");
		System.out.println("O " + this.nomeTime + " está jogando com a camisa " + this.cores);
	}

	@Override
	public void ganhouOuPerdeu() {

		Random random = new Random();
		this.nomeTime = "Palmeiras";
		boolean palmeirasGanhou = random.nextBoolean();

		if (palmeirasGanhou) {
			System.out.println("------------------------------------------------");
			System.out.println("O " + this.nomeTime + " ganhou esta partida!");
		} else {
			System.out.println("-------------------------------------------------");
			System.out.println("O " + this.nomeTime + " perdeu esta partida!");
		}

	}

	@Override
	public void pontuacao() {
		Random random = new Random();

		int pontos = 0;
		this.nomeTime = "Palmeiras";

		System.out.println("****CAMPEONATO DOS 9 PONTOS CORRIDOS****");

		for (int partida = 1; partida <= 3; partida++) {

			boolean palmeirasGanhou = random.nextBoolean();

			if (palmeirasGanhou) {
				System.out.println(partida + " º [partida]: O Palmeiras ganhou a partida!");
				pontos += 3;
				System.out.println(pontos + " pontos conquistados");
				System.out.println("--------------------------------------------------------------------");

			} else {

				System.out.println(partida + " º [partida]: O Palmeiras precisa treinar mais. Perdeu o jogo!");
				System.out.println("--------------------------------------------------------------------");
			}
		}
		System.out.println("Pontuação final :" + pontos);
		if (pontos == 9) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("*** O PALMEIRAS É CAMPẼAO 2023 DO CAMPEONATO DOS 9 PONTOS CORRIDOS ***");
		}
	}

	@Override
	public void campeao() {
		pontuacao();
		int pontos = 0;

		if (pontos == 9) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("*** O PALMEIRAS É CAMPẼAO 2023 DO CAMPEONATO DOS 9 PONTOS CORRIDOS ***");
		}
	}

}
