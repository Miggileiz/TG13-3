Threads mit Interface

## Nachteil bei Erben von Threads
Bei der bisherigen Erstellung eines Threads mit Vererbung ist der Nachteil, dass nicht von anderen Klassen
geerbt werden kann.

## Vorteil bei Erben von Threads 
Verwaltungsmethoden für Threads sind beim erben automatisch verfügbar.

## Übung wie in Ordner 1 
1. Erstellen der Klassen `ErzeugeThread.java` und `MeinThread.java`
    ````java
    public class MeinThread{}

    public class ErzeugeThread{
        public static void main(String[]  args){}
    }
    ````
2. Erzeugen Sie in `MeinThread.java` einen Thread mit dem Interface `Runnable`.
    ````java
    public class MeinThread implements Runnable{
    ````

3. Überschreiben Sie die `run()`-Methode.
    ````java
    @Override
    public void run() {
        
    }
    ````

4. Deklarieren Sie ein Threadobjekt `Thread t;`
    ````java
    public class MeinThread implements Runnable{
    
    String name;
    int wait;
    Thread t;
    //...
    ````

5. Erzeugen Sie das Threadobjekt im Konstruktor.
    ````java
     public MeinThread(String name, int wait){
        this.name = name;
        this.wait = wait;
        t = new Thread(this);
    }
    ````
6. Delegieren Sie mit der Methode `start()` den Aufruf von `t.start()` an den Thread.
    ````java
    public void start(){
        t.start();
    }
    ````
7. Implementieren Sie den Thread so, dass er dass gleiche tut wie in **Aufgabe 1**.
    ````java
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(name+" "+i);    

            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
    ````

8. Erzeugen Sie 2 Threads und starten sie diese in der ausführbaren Klasse `ErzeugeThreads.java`.

    ````java
    public class ErzeugeThreadMitInterface {
   
        public static void main(String[] args) {
            System.out.println("Thread mit Interface erstellen gestartet");

            //Threadobjekte erzeugen
            MeinThread a = new MeinThread("a", 3);
            MeinThread b = new MeinThread("b", 10);
    
            //Threads nebenläufig starten
            a.start();
            b.start();
            
        }
    }
     ````


>**Merke:**
>Bei Verwendung eines Interfaces kann die eigene Thread-Klasse von einer bestehenden Klasse erben.
