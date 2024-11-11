package ThreadAmpel;

public class StarteAmpel {

	public static void main(String[] args) {
		// Beginn main Thread
		System.out.println("Ampel Start");
		
		//Thread Objekt erzeugen
		Ampel ampel1 = new Ampel("ampel1",2000);
		Ampel ampel2 = new Ampel("ampel2",2000);
		
		Thread thread1 = new Thread(ampel1);
		Thread thread2 = new Thread(ampel2);

		thread1.start();
		thread2.start();
		
	}

}
