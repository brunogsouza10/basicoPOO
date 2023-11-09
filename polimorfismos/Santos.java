package polimorfismos;

import java.util.Random;
import java.util.Scanner;

public final class Santos extends TimeDeFutebol {
//FILHAS, FOLHAS

	@Override
	public void marcarPartida() {

		Scanner scanner = new Scanner(System.in);

		int numeroJogo;

		System.out.println("***MARCAR PARTIDAS***");
		System.out.println("[Jogo 2] - Palmeiras X Santos");
		System.out.println("[Jogo 3] - SPFC X Santos");
		System.out.println("[Jogo 6] - Corinthians X Santos");
		System.out.println("--------------------------------------");
		System.out.println("Escolha o número do jogo a ser marcado: ");
		numeroJogo = scanner.nextInt();

		if (numeroJogo == 2) {
			System.out.println("Jogam hoje: ");
			System.out.println("[Jogo 2] - Palmeiras X Santos");
			ganhouOuPerdeu();

		} else if (numeroJogo == 3) {
			System.out.println("Jogam hoje: ");
			System.out.println("[Jogo 3] - SPFC X Santos]");
			ganhouOuPerdeu();

		} else if (numeroJogo == 6) {
			System.out.println("Jogam hoje: ");
			System.out.println("[Jogo 6] - Corinthians X Santos");
			ganhouOuPerdeu();

		} else {
			System.out.println("-----------------------------------------------------");
			System.out.println("Erro. Número de jogo ainda não previsto no calendário.");
			System.exit(numeroJogo);
		}

		Random random = new Random();
		boolean santosGanhou = random.nextBoolean();

		if (santosGanhou) {
			System.out.println("------------------------------");
			System.out.println("O Santos ganhou a partida!");
		} else {
			System.out.println("------------------------------");
			System.out.println("O Santos perdeu a partida!");
		}

	}

	@Override
	public void jogar() {
		this.nomeTime = "Santos";
		this.numeroDeJogadores = 11;
		this.cores = "Preto e Branca";

		System.out.println("O " + this.nomeTime + " está em campo com seus " + this.numeroDeJogadores + " jogadores!");
		System.out.println("O " + this.nomeTime + " está jogando com a camisa " + this.cores);
	}

	@Override
	public void ganhouOuPerdeu() {
		
		Random random = new Random();
		this.nomeTime = "Santos";
		boolean santosGanhou = random.nextBoolean();
		
        if (santosGanhou) {
        	System.out.println("------------------------------------------------");
        	System.out.println("O " +this.nomeTime + " ganhou esta partida!");
        } else {
        	System.out.println("-------------------------------------------------");
        	System.out.println("O " +this.nomeTime+ " perdeu esta partida!");
	}
		
	}
	
	@Override
	public void pontuacao() {
		Random random = new Random();

		int pontos = 0;
		this.nomeTime = "Santos";

		System.out.println("****CAMPEONATO DOS 9 PONTOS CORRIDOS****");

		for (int partida = 1; partida <= 3; partida++) {

			boolean palmeirasGanhou = random.nextBoolean();

			if (palmeirasGanhou) {
				System.out.println(partida + " º [partida]: O Santos ganhou a partida!");
				pontos += 3;
				System.out.println(pontos + " pontos conquistados");
				System.out.println("--------------------------------------------------------------------");

			} else {

				System.out.println(partida + " º [partida]: O Santos precisa treinar mais. Perdeu o jogo!");
				System.out.println("--------------------------------------------------------------------");
			}
		}
		System.out.println("Pontuação final :" + pontos);
		if (pontos == 9) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("*** O SANTOS É CAMPẼAO 2023 DO CAMPEONATO DOS 9 PONTOS CORRIDOS ***");
		}
	}

	@Override
	public void campeao() {
       pontuacao();
       int pontos = 0;
       
       if (pontos == 9) {
			System.out.println("------------------------------------------------------------------");
			System.out.println("*** O SANTOS É CAMPẼAO 2023 DO CAMPEONATO DOS 9 PONTOS CORRIDOS ***");
		}
       
	}

}
