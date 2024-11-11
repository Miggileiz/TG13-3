package ThreadAmpel;

public class Ampel implements Runnable {

	private String name;
	private int aktZustand;
	private int wait = 0;
	
	public Ampel(String name, int wait) {
		
		this.name= name;
		this.aktZustand = ROT;
		this.wait = wait;
	}
	
	
	public static final int ROT = 0;
	public static final int ROTGELB = 1;
	public static final int GELB = 2;
	public static final int GRUEN = 3;
	
		
	@Override
	public void run() {
		while(true) {
			
			
			try {
				
			switch(aktZustand) {
			
			case ROT:
			System.out.println(name + "ROT");
			aktZustand= ROTGELB;
			break;
			
			case ROTGELB:
				aktZustand= GELB;

			System.out.println(name + "ROTGELB");
			break;

			case GELB:
				aktZustand= GRUEN;

			System.out.println(name + "GELB");
			break;
			
			case GRUEN:
				aktZustand= ROT;

			System.out.println(name + "GREUN");
			break;
			}
			Thread.sleep(wait);	
			
			}
			catch (InterruptedException e) {
			System.out.println(name +"wurde unterbrochen");				}
		}
	}
	
}
