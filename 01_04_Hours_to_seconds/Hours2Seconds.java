public class Hours2Seconds{

	public static void main(String[] args) {
		int hours = 12; // Assignem les hores abans de fer el càlcul
		int seconds = (60 * 60) * hours; // Operació per transformar hores a segons aquí
		System.out.println(hours + " hours are " + seconds + " seconds"); // Sortida formatada

		hours = 15;
		seconds = (60 * 60) * hours;
		System.out.println(hours + " hours are " + seconds + " seconds");
		
		hours = 23;
		seconds = (60 * 60) * hours;
		System.out.println(hours + " hours are " + seconds + " seconds");
		

    }

}