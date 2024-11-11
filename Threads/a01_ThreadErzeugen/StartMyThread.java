package a01_ThreadErzeugen;

public class StartMyThread {

	public static void main(String[] args) {
		// Beginn main Thread
		System.out.println("Main thread gestartet");
		
		//Thread Objekt erzeugen
		MyThread a = new MyThread("a",1, 50);
		MyThread x = new MyThread("x",100, 30);
		MyThread c = new MyThread("c",300, 33);
		
		
		//Thread starten
		a.start(); //nicht nebenläufiger Aufruf -> falsch
		x.start(); //nebenläufiger Aufruf -> richtig
		c.start(); //nebenläufiger Aufruf -> richtig
		
		System.out.println("Main Thread zuende");

	}

}
