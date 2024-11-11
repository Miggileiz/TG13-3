package THreadUB;

import java.util.Scanner;

import AMpel.AmpelErzg;

public class ThreadUnterbechen {
    public static void main(String[] args) {
        
        System.out.println("Thread gestartet:");

        ThreadUnterbrerzg a1 = new ThreadUnterbrerzg("A1", 1000);
        ThreadUnterbrerzg a2 = new ThreadUnterbrerzg("A2", 2000);

        a1.start();
        a2.start();

        Scanner s =new Scanner(System.in);

        System.out.println("Zahl eingeben: ");

        if(s.nextInt()==1){
            a1.stop();
            a2.stop();
        }
}
}


