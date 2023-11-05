package polimorfismo;

public class ProgramaInicial {

	public static void main(String[] args) {

		Mamífero mamifero = new Mamífero();
		Réptil reptil = new Réptil();
		Peixe peixe = new Peixe();
		Ave ave = new Ave();
		Canguru canguru = new Canguru();
		Cachorro cao = new Cachorro();
		Cobra cobra = new Cobra();
		Tartaruga tartaruga = new Tartaruga();
		PeixeDourado peixeDourado = new PeixeDourado();
		Arara arara = new Arara();

		canguru.locomover();
		cao.locomover();

	}

}
