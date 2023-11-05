package polimorfismo;

public class Canguru extends Mamífero {
	
	public void usarBolsa() {
		System.out.println("Usando bolsa");
	}
    @Override
	public void locomover() {
		System.out.println("Saltando");
	}
	
}
