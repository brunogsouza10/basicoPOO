package RelacaoEntreClasses;

public class Lutadores {

	public static void main(String[] args) {
		
		Lutador[] lutadores = new Lutador[6];
		
		lutadores[0] = new Lutador("Pretty Boy", "França" , 31 , 1.75 , 68.9, 11, 3, 1);
		
		lutadores[1] = new Lutador ("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
		
		lutadores[2] = new Lutador ("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
		
		lutadores[3] = new Lutador ("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
		
		lutadores[4] = new Lutador ("Java Gracie", "Japão", 22, 1.88, 89.5, 5, 0, 2);
		
		lutadores[5] = new Lutador ("Python Boy", "Irlanda", 18, 2.0, 90.3, 7, 0, 0);
		
		
		
		
		
		
		
		
		
		Luta lutar = new Luta();
		
		lutar.marcarLuta(lutadores[4], lutadores[5]);
		lutar.lutar();
		lutadores[4].status();
		lutadores[5].status();
		
	}

}
