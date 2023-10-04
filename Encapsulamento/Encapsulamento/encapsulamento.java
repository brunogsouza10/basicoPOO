package encapsulamento;

//poo

public class ControleRemoto implements Controlador {
	
	
	//ATRIBUTOS
	private int volume;
	private boolean ligado;
	private boolean tocando;
	private boolean gravando;
	private int apertarBotao;
	private int canal1;
	private int canal2;
	private int canal3;
	private int canal4;
	private int canal5;
	private int canal6;
	private int canal7;
	private int canal8;
	private int canal9;
	private int canal10;
	private int canal11;
	private int canal12;
	private int canal13;
	private boolean usarHdmi;
	
	//MÉTODO CONSTRUTOR (ESPECIAIS)
	public ControleRemoto() {
		super();
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
		this.gravando = false;
		this.apertarBotao = 1;
		this.usarHdmi = false;
		
	
		
		
	}
	//MÉTODO GETTER E SETTER (ESPECIAIS)
	
	
	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getApertarBotao() {
		return apertarBotao;
	}


	public void setApertarBotao(int apertarBotao) {
		this.apertarBotao = apertarBotao;
	}
	
	
	public int getCanal1() {
		return canal1;
	}


	public void setCanal1(int canal1) {
		this.canal1 = canal1;
	}

	public int getCanal2() {
		return canal2;
	}


	public void setCanal2(int canal2) {
		this.canal2 = canal2;
	}
	
	

	public int getCanal3() {
		return canal3;
	}


	public void setCanal3(int canal3) {
		this.canal3 = canal3;
	}


	public int getCanal4() {
		return canal4;
	}


	public void setCanal4(int canal4) {
		this.canal4 = canal4;
	}


	public int getCanal5() {
		return canal5;
	}


	public void setCanal5(int canal5) {
		this.canal5 = canal5;
	}


	public int getCanal6() {
		return canal6;
	}


	public void setCanal6(int canal6) {
		this.canal6 = canal6;
	}


	public int getCanal7() {
		return canal7;
	}


	public void setCanal7(int canal7) {
		this.canal7 = canal7;
	}


	public int getCanal8() {
		return canal8;
	}


	public void setCanal8(int canal8) {
		this.canal8 = canal8;
	}


	public int getCanal9() {
		return canal9;
	}


	public void setCanal9(int canal9) {
		this.canal9 = canal9;
	}


	public int getCanal10() {
		return canal10;
	}


	public void setCanal10(int canal10) {
		this.canal10 = canal10;
	}


	public int getCanal11() {
		return canal11;
	}


	public void setCanal11(int canal11) {
		this.canal11 = canal11;
	}


	public int getCanal12() {
		return canal12;
	}


	public void setCanal12(int canal12) {
		this.canal12 = canal12;
	}


	public int getCanal13() {
		return canal13;
	}


	public void setCanal13(int canal13) {
		this.canal13 = canal13;
	}


	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	private boolean getGravando () {
		return gravando;
	}
	
	private void setGravando (boolean gravando) {
		this.gravando = gravando;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	
	public boolean getUsarHdmi() {
		return usarHdmi;
	}

	
	public void setUsarHdmi(boolean usarHdmi) {
		this.usarHdmi = usarHdmi;
	}
	
 
	//MÉTODOS ABSTRATOS
	@Override
	public void ligar() {
		this.setLigado(true);
		
	}
	@Override
	public void desligar() {
		this.setLigado(false);
		
	}
	
	@Override
	public void usarHdmi() {
		this.setUsarHdmi(true);
		if (this.getLigado() && this.getUsarHdmi()) {
			System.out.println("TELA: HDMI pronto para uso...");
			
		} else {
			this.setUsarHdmi(false);
	}
	}
	
	@Override
	public void abrirMenu() {
		if (this.getLigado()){
		System.out.println("\n****LÓGICA INTERNA DA TV****");
		System.out.println("Está ligado? " + this.getLigado());
		System.out.println("Canal < [+] * [-] >: " + this.getApertarBotao());
		System.out.println("HDMI: " + this.getUsarHdmi());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("Está gravando? " + this.getGravando());
		System.out.print("Volume: " + this.getVolume());
		
		
		for(int i = 1; i <= this.getVolume(); i += 10) {
			System.out.print("|");
		} 
		} else {
			System.out.println("SISTEMA: Impossível abrir o menu, o aparelho não está ligado!");
		}
		
		}
		
	@Override
	public void apertarBotao() {
		
	
		
	}		
	
	
	@Override
	public void fecharMenu() {
		System.out.println("TELA: Fechando Menu...");
		
	}
	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume()+10);
		} else {
			System.out.println("SISTEMA: Impossível aumentar...não está ligado");
		}
		
	}
	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume()-10);
		} else {
			System.out.println("SISTEMA: Impossível diminuir...não está ligado");
		}
		
	}
	@Override
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}
	@Override
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0){
			this.setVolume(50);
		}
		
	}
	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("TELA: Não consegui reproduzir!");
		}
		
	}
	
	@Override
	public void rec() {
		if (this.getLigado() && (this.getTocando() == true)) {
			this.setGravando(true);
			System.out.println("TELA: Gravando...");
		} else {
			System.out.println("TELA: ERRO!Não pode gravar.O aparelho não está tocando!");
		}
		
	}
	
	
	@Override
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
			
		} else {
			System.out.println("Não consegui pausar!");
		}
		if (this.getTocando() == false && this.getGravando() == true) {
			this.setGravando(false) ;
			System.out.println("Gravação Pausada!");
		}
	}
	@Override
	public void canalMais() {
		
		 if (this.getLigado()) {
		        if (this.getApertarBotao() < 13) {
		            this.setApertarBotao(this.getApertarBotao() + 1);
		        } else {
		            this.setApertarBotao(1);
		        }
		    } else {
		        System.out.println("Impossível mudar de canal...não está ligado");
		    
	
		    }
	
		
	}

	/*if (this.getApertarBotao() < 13): Aqui, verifica-se se o canal atual (obtido através do método getApertarBotao()) 
	 * é menor que 13. Isso significa que, se o canal atual for menor que 13, ainda há canais disponíveis para avançar. 
	 * Portanto, podemos aumentar o número do canal em 1.
	 * 
	 * this.setApertarBotao(this.getApertarBotao() + 1): Se a condição acima for verdadeira, então aumentamos o 
	 * número do canal em 1. Isso corresponde a "avançar" para o próximo canal.
	 * 
	 * else: Se a condição do primeiro if for falsa, isso significa que já estamos no canal 13 (ou além). 
	 * Neste caso, não há mais canais disponíveis para avançar. Portanto, devemos voltar ao primeiro canal
	 * (presumivelmente, o canal 1).

     this.setApertarBotao(1): Define o canal para 1.*/
	
	@Override
		public void canalMenos() {
		
		    if (this.getLigado()) {
		        if (this.getApertarBotao() > 1) {
		            this.setApertarBotao(this.getApertarBotao() - 1);
		        } else {
		            this.setApertarBotao(13);
		        }
		    } else {
		        System.out.println("Impossível mudar de canal...não está ligado");
		    }
		

		    }

}

/*if (this.getApertarBotao() > 1): Aqui, verifica-se se o canal atual (obtido através do método getApertarBotao()) 
 * é maior que 1. Isso significa que, se o canal atual for maior que 1, ainda há canais disponíveis para diminuir. 
 * Portanto, podemos diminuir o número do canal em 1.
 * 
 *  this.setApertarBotao(this.getApertarBotao() - 1): Se a condição acima for verdadeira, então diminuimos o 
	 * número do canal em 1. Isso corresponde a "regredir" para o próximo canal.
	 * 
	 * * else: Se a condição do primeiro if for falsa, isso significa que já estamos no canal 1. 
	 * Neste caso, não há mais canais disponíveis para regredir. Portanto, devemos voltar ao último canal
	 * (presumivelmente, o canal 13).

     this.setApertarBotao(13): Define o canal para 13.*/

      
