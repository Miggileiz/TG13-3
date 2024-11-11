package ThreadMitInterface;


public class ErzeugeThread {

	
	public static void main(String[] args) {
		// Beginn main Thread
				System.out.println("THREAD MIT INTERFACE GESTARTET");
				
				//Thread Objekt erzeugen
				MeinThread a = new MeinThread("a",1);
				MeinThread x = new MeinThread("x",100);
				MeinThread c = new MeinThread("c",300);
				
				
				//Thread starten
				a.start();
				x.start(); 
				c.start();
				
	

	}
	
	

}
