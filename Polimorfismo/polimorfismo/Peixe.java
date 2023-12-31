package polimorfismo;

public class Peixe extends Animal{
	
	private String corDaEscama;
	
	public void soltarBolha() {
		System.out.println("Soltou uma bolha");
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}

	public String getCorDaEscama() {
		return corDaEscama;
	}

	public void setCorDaEscama(String corDaEscama) {
		this.corDaEscama = corDaEscama;
	}
}

