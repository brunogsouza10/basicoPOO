package sobrecarga;

public class Quadrilatero {
	
	public double calcularArea( double lado) {
	return lado * lado;
	}
	public double calcularArea(double baseMaior, double baseMenor) {
	return baseMaior * baseMenor;	
	}
	public double calcularArea(double baseMaior, double baseMenor, double altura) {
	return ((baseMaior + baseMenor) * altura)/2;	
	}
	public double calcularArea(float diagonalMaior, float diagonalMenor) {
	return diagonalMaior * diagonalMenor;	
		
	}

}
