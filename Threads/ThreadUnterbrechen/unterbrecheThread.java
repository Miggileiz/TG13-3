package ThreadUnterbrechen;

import java.util.Scanner;

public class unterbrecheThread extends Thread {

	static int i=0;
		@Override
		public void run() {
			System.out.println("Thread starten");

			while (true) {

				if (this.isInterrupted())
					break;

				System.out.println("Thread läuft...");
				try {
					
					for (i = 0; i < 100; i++) {
						System.out.println("Thread:"+i);
						Thread.sleep(1000);
					}
					
				} catch (InterruptedException e) {
					interrupt();
				}

			}
			System.out.println("Thread beendet");
		}
		
		
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
		    System.out.flush();
			System.out.println(" Main Thread startet");
			
			
			unterbrecheThread uThread = new unterbrecheThread();
			uThread.start();
			
			
			System.out.println("eingeben:");
			if(s.nextInt()==0) {
				
				uThread.interrupt();
			}
			
				
			System.out.println("Main Thread zuende");
			
		}

	}

