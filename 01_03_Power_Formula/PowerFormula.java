public class PowerFormula {

	public static void main(String[] args) {
		// Assignem els valors per realitzar la operació
		double force = 125;
		double distance = 37;
		double time = 12;
	
		double power = force * (distance / time); // Funció per calcular la potència
		System.out.println("Power = " + power + " W"); // Sortida formatada mostrant la potència
	}
}