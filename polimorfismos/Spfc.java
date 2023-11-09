package polimorfismos;

import java.util.Scanner;

import java.util.Random;

//SPFC, PAI DE TODOS
public final class Spfc extends TimeDeFutebol {

	@Override
	public void marcarPartida() {

		Scanner scanner = new Scanner(System.in);

		int numeroJogo;

		System.out.println("***MARCAR PARTIDAS***");
		System.out.println("[Jogo 1] - SPFC X Corinthians");
		System.out.println("[Jogo 3] - SPFC X Santos");
		System.out.println("[Jogo 5] - SPFC X Palmeiras");
		System.out.println("--------------------------------------");
		System.out.println("Escolha o número do jogo a ser marcado: ");
		numeroJogo = scanner.nextInt();

		if (numeroJogo == 1) {
			System.out.println("Jogo marcado para hoje: ");
			System.out.println("[Jogo 1] - SPFC X Corinthians");
			ganhouOuPerdeu();

		} else if (numeroJogo == 3) {
			System.out.println("Jogo marcado para hoje: ");
			System.out.println("[Jogo 3] - SPFC X Santos]");
			ganhouOuPerdeu();

		} else if (numeroJogo == 5) {
			System.out.println("Jogo marcado para hoje: ");
			System.out.println("[Jogo 5] - SPFC X Palmeiras");
			ganhouOuPerdeu();

		} else {
			System.out.println("-----------------------------------------------------");
			System.out.println("Erro. Número de jogo ainda não previsto no calendário.");
			System.exit(numeroJogo);
		}

	}

	@Override
	public void jogar() {
		this.nomeTime = "SPFC";
		this.numeroDeJogadores = 11;
		this.cores = "Vermelha, Preta e Branca";

		System.out.println("O " + this.nomeTime + " está em campo com seus " + this.numeroDeJogadores + " jogadores!");
		System.out.println("O " + this.nomeTime + " jogando com a camisa " + this.cores);
	}

	@Override
	public void ganhouOuPerdeu() {

		Random random = new Random();
		this.nomeTime = "SPFC";
		boolean spfcGanhou = random.nextBoolean();

		if (spfcGanhou) {
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
		this.nomeTime = "SPFC";

		System.out.println("****CAMPEONATO DOS 9 PONTOS CORRIDOS****");

		for (int partida = 1; partida <= 3; partida++) {

			boolean spfcGanhou = random.nextBoolean();

			if (spfcGanhou) {
				System.out.println(partida + " º [partida]: O SPFC ganhou a partida!");
				pontos += 3;
				System.out.println(pontos + " pontos conquistados");
				System.out.println("--------------------------------------------------------------------");

			} else {

				System.out.println(partida + " º [partida]: O SPFC precisa treinar mais. Perdeu o jogo!");
				System.out.println("--------------------------------------------------------------------");
			}
		}
		System.out.println("Pontuação final :" + pontos);
		if (pontos == 9) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("*** O SPFC É CAMPẼAO 2023 DO CAMPEONATO DOS 9 PONTOS CORRIDOS ***");
		}
	}

	@Override
	public void campeao() {
		pontuacao();
		int pontos = 0;

		if (pontos == 9) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("*** O SPFC É CAMPẼAO 2023 DO CAMPEONATO DOS 9 PONTOS CORRIDOS ***");
		}
	}

}
