package a01_ThreadErzeugen;

public class MyThread extends Thread {

		String name;
		int wait;
		int ende;
		
		public MyThread(String name, int wait, int ende) {

			this.name = name;
			this.wait = wait;
			this.ende = ende;
		}
		
		
		public void run() {

			for (int i = 0; i < ende; i++) {
				
				System.out.println(name + ": " + i);
				try {
					Thread.sleep(wait);
				} catch (InterruptedException e) {
					e.printStackTrace();				
					}
			}
		}
		
}
