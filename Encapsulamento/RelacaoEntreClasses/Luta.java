
package RelacaoEntreClasses;

import java.util.Random;

//CLASSE DE AGREGAÇAO
public class Luta {

	
	//ATRIBUTOS
	private Lutador desafiado;//instancia da classe lutador 
	private Lutador desafiante ;
	private int rounds;
	private boolean aprovada;
	
	//MÉTODOS PÚBLICOS
	public void marcarLuta(Lutador lutador1, Lutador lutador2 ) {
		
		if (lutador1.getCategoria() == lutador2.getCategoria()
			&& (lutador1 != lutador2)){
				this.aprovada = true;
				this.desafiado = lutador1;
				this.desafiante = lutador2;
			}else {
				
				this.aprovada = false;
				this.desafiado = null;
				this.desafiante = null;
			}
		}

		
	
	
	public void lutar() {
		
		
		
		if (this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random random = new Random();
			int vencedor = random.nextInt(3);
			
			switch(vencedor) {
			
		
			case 0: // Empate
				System.out.println("***RESULTADO DA LUTA***\nEmpataram! ");
			    this.desafiado.empatarLuta();
			    this.desafiante.empatarLuta();
			    break;
			    
			case 1: // Ganhou desafiado
				System.out.println("***RESULTADO DA LUTA***\nVitória do "+ this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
				
			case 2: //Ganhou desafiante
				System.out.println("***RESULTADO DA LUTA***\nVitória do " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;
			
			}
			
		} else {
			
			System.out.println("Luta não pode acontecer!");
		}
		
	}
	
	
    //MÉTODOS ESPECIAIS
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
	
	
}
