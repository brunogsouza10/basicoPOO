package treinarEncapsulamento;

import java.util.Scanner;

public class Jogo implements TelaUsuario {

    // ATRIBUTOS
    
    private boolean itIsOn = false;
    private boolean itIsOff = true;

    // MÉTODOS ESPECIAIS - GETTERS E SETTERS PROCEDEM DOS ATRIBUTOS

    public boolean getItIsOn() {
        return itIsOn = false;
    }

    public void setItIsOn(boolean itIsOn) {
        this.itIsOn = itIsOn;
    }

    public boolean getItIsOff() {
        return itIsOff = true;
    }

    public void setItIsOff(boolean itIsOff) {
        this.itIsOff = itIsOff;
    }

    // CONSTRUTOR
    
    public Jogo() {
  		super();
  		this.itIsOn = itIsOn;
  		this.itIsOff = itIsOff;
  	}


    // MÉTODOS ABSTRATOS

    @Override
    public void status() {

        char answer;

        System.out.println("***RESPOSTA OU DESAFIO***");
        System.out.println("Jogo desligado: " + this.itIsOff);
        System.out.println("Deseja ligar o jogo? :");

        Scanner scanner = new Scanner(System.in);
        answer = scanner.next().charAt(0);
        System.out.println("-------------------------");

        if (answer == 's' || answer == 'S') {
            
        	
        	
            System.out.println("JOGO LIGADO : " + this.getItIsOff());
            System.out.println("Jogo desligado: " + this.itIsOn);
            System.out.println("-------------------------");

        } else if (answer == 'n' || answer == 'N') {
        	
        	System.out.println("Desligado");
        }
    }

	@Override
    public void play() {
        //PERGUNTA 1
    	 char choose;
    	 String uAnswer;
    	 
    	 Scanner scanner = new Scanner(System.in);
    	 
    	 System.out.println("*****RESPOSTA OU DESAFIO*****");
    	 player();
    	 System.out.println("---------------------------------------");
    	 System.out.println("1 - O QUE SÃO ESTRUTURAS CONDICIONAIS?");
    	 System.out.println("Deseja responder[R] ou ser desafiado[D]:");
    	
    	 choose = scanner.next().charAt(0);
    	 
    	 if (choose == 'R' || choose == 'r') {
    	    	
    		 Scanner scanner1 = new Scanner(System.in);
    		 
    		 System.out.println("Escreva sua resposta: ");
    		 uAnswer = scanner1.nextLine();
    		 System.out.println("RESPOSTA IMPRESSA");
    		 System.out.println(uAnswer);//imprime a resposta escrita na tela;
    		 System.out.println("--------------------------------------------------");
    		 System.out.println("RESPOSTA DO PROFESSOR");
    		 System.out.println("São condições que podem ser verdadeiras ou falsas");
    		 System.out.println("--------------------------------------------------");
    		 stop();
    		 
    	 }else {
    		 
    		 if (choose == 'D' || choose == 'd') {
    			 System.out.println("Você escolheu desafio");
    			 System.out.println("---------------------------------------------------------");
    			 System.out.println("Eu desafio você a escrever esse mesmo código em Python!");
    			 System.out.println("---------------------------------------------------------");
    			 stop();
    		 }
    	 }
    	 //PERGUNTA 2
    	 char choose1;
    	 String uAnswer1;
    	 
    	 Scanner scanner2 = new Scanner(System.in);
    	 
    	 System.out.println("\n*****RESPOSTA OU DESAFIO*****");
    	 System.out.println("--------------------------------------------------------");
    	 System.out.println("2 - O QUE SÃO LAÇOS DE REPETIÇÃO?");
    	 System.out.println("Deseja responder[R] ou ser desafiado[D]:");
    	
    	 choose = scanner.next().charAt(0);
    	 
    	 if (choose == 'R' || choose == 'r') {
    	    	
    		 Scanner scanner1 = new Scanner(System.in);
    		 
    		 System.out.println("Escreva sua resposta: ");
    		 uAnswer = scanner1.nextLine();
    		 System.out.println("RESPOSTA IMPRESSA");
    		 System.out.println(uAnswer);//imprime a resposta escrita na tela;
    		 System.out.println("--------------------------------------------------");
    		 System.out.println("RESPOSTA DO PROFESSOR");
    		 System.out.println("São repetições de programas que utilizam blocos de códigos, \nque "
    		 		+ "podem ser iniciados, delimitados, atualizados, verdadeiros e falsos e infinitos.");
    		 System.out.println("----------------------------------------------------------------------");
    		 stop();
    		 
    	 }else {
    		 
    		 if (choose == 'D' || choose == 'd') {
    			 System.out.println("Você escolheu desafio");
    			 System.out.println("---------------------------------------------------------");
    			 System.out.println("Eu desafio você a escrever esse mesmo código em C!");
    			 System.out.println("---------------------------------------------------------");
    			 stop();
    		 }
    	 }
    	 //PERGUNTA 3
    	 char choose2;
    	 String uAnswer2;
    	 
    	 Scanner scanner3 = new Scanner(System.in);
    	 
    	 System.out.println("\n*****RESPOSTA OU DESAFIO*****");
    	 System.out.println("---------------------------------------");
    	 System.out.println("3 - O QUE SÃO VARIÁVEIS?");
    	 System.out.println("Deseja responder[R] ou ser desafiado[D]:");
    	
    	 choose = scanner.next().charAt(0);
    	 
    	 if (choose == 'R' || choose == 'r') {
    	    	
    		 Scanner scanner1 = new Scanner(System.in);
    		 
    		 System.out.println("Escreva sua resposta: ");
    		 uAnswer = scanner1.nextLine();
    		 System.out.println("RESPOSTA IMPRESSA");
    		 System.out.println(uAnswer);//imprime a resposta escrita na tela;
    		 System.out.println("--------------------------------------------------");
    		 System.out.println("RESPOSTA DO PROFESSOR");
    		 System.out.println("São dados que recebem nomes e armazenam valores na memória do computador\n e acompanham os Tipos Primitivos");
    		 System.out.println("------------------------------------------------------------------------------------------------------");
    		 stop();
    		 
    	 }else {
    		 
    		 if (choose == 'D' || choose == 'd') {
    			 System.out.println("Você escolheu desafio");
    			 System.out.println("---------------------------------------------------------");
    			 System.out.println("Eu desafio você a escrever esse mesmo código em C#!");
    			 System.out.println("----------------------------------------------------------");
    			 stop();
    			 
    		 }
    	 }
    	 //PERGUNTA 4 
    	 char choose3;
    	 String uAnswer3;
    	 
    	 Scanner scanner4 = new Scanner(System.in);
    	 
    	 System.out.println("\n*****RESPOSTA OU DESAFIO*****");
    	 System.out.println("---------------------------------------");
    	 System.out.println("4 - O QUE SÃO FRAMEWORKS?");
    	 System.out.println("Deseja responder[R] ou ser desafiado[D]:");
    	
    	 choose = scanner.next().charAt(0);
    	 
    	 if (choose == 'R' || choose == 'r') {
    	    	
    		 Scanner scanner1 = new Scanner(System.in);
    		 
    		 System.out.println("Escreva sua resposta: ");
    		 uAnswer = scanner1.nextLine();
    		 System.out.println("RESPOSTA IMPRESSA");
    		 System.out.println(uAnswer);//imprime a resposta escrita na tela;
    		 System.out.println("--------------------------------------------------");
    		 System.out.println("RESPOSTA DO PROFESSOR");
    		 System.out.println("São estruturas e blocos de códigos, assim como bibliotecas pré-prontas, que servem para\n"
    		 		+ "construir softwares e aplicações.");
    		 System.out.println("-----------------------------------------------------------------------------------------");
    		 stop();
    		 
    	 }else {
    		 
    		 if (choose == 'D' || choose == 'd') {
    			 System.out.println("Você escolheu desafio");
    			 System.out.println("---------------------------------------------------------");
    			 System.out.println("Eu desafio você a escrever esse mesmo código em Java!");
    			 System.out.println("---------------------------------------------------------");
    			 stop();
    		 }
    	 }
    	 //PERGUNTA 5
    	 char choose4;
    	 String uAnswer4;
    	 
    	 Scanner scanner5 = new Scanner(System.in);
    	 
    	 System.out.println("\n*****RESPOSTA OU DESAFIO*****");
    	 System.out.println("---------------------------------------");
    	 System.out.println("5 - O QUE É LÓGICA DE PROGRAMAÇÃO?");
    	 System.out.println("Deseja responder[R] ou ser desafiado[D]:");
    	
    	 choose = scanner.next().charAt(0);
    	 
    	 if (choose == 'R' || choose == 'r') {
    	    	
    		 Scanner scanner1 = new Scanner(System.in);
    		 
    		 System.out.println("Escreva sua resposta: ");
    		 uAnswer = scanner1.nextLine();
    		 System.out.println("RESPOSTA IMPRESSA");
    		 System.out.println(uAnswer);//imprime a resposta escrita na tela;
    		 System.out.println("--------------------------------------------------");
    		 System.out.println("RESPOSTA DO PROFESSOR");
    		 System.out.println("É a lógica aplicada à computação, utilizando as línguagens de alto nível, compiladores, interpretadores e"
    		 		+ "\n de baixo nível(máquina) operando pela Unidade Lógico Aritmética do Computador. ");
    		 System.out.println("-----------------------------------------------------------------------------------------------------------");
    		 System.out.println("Fim do jogo");
    		 System.exit(0);
    		 
    	 }else {
    		 
    		 if (choose == 'D' || choose == 'd') {
    			 System.out.println("Você escolheu desafio");
    			 System.out.println("---------------------------------------------------------");
    			 System.out.println("Eu desafio você a escrever esse mesmo código em pseudo-linguagem Portugol!");
    			 System.out.println("---------------------------------------------------------------------------");
    			 System.out.println("Fim do Jogo");
    			 System.exit(0);
    		 }
    	 }
    	 
    	//fim do método play()
    	
    	
    }

    @Override
    public void stop() {
    	
      char stopGame;
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Deseja pausar o jogo? [S]/[N]: ");
      stopGame = scanner.next().charAt(0);
      
      if (stopGame == 'S' || stopGame == 's') {
    	  
    	  System.out.println("Parou o jogo!");
    	  System.exit(0);
      }
      
    }

    @Override
    public void player() {
    	
    	String namePlayer;
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Digite seu nome: ");
    	namePlayer = scanner.nextLine();
    	
    	//nome do jogador e depois inseri-lo no metodo play()

    }
}
