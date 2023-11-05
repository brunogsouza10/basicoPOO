package polimorfismo;

public class Ave extends Animal {

	private String corDaPena;

	public void fazerNinho() {
		System.out.println("Construiu um ninho");
	}

	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
         System.out.println("Comendo frutas");
	}

	@Override
	public void emitirSom() {
        System.out.println("Som de ave");
	}

	public String getCorDaPena() {
		return corDaPena;
	}

	public void setCorDaPena(String corDaPena) {
		this.corDaPena = corDaPena;
	}

}
