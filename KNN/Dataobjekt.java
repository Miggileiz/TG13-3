public class Dataobjekt{
    int x;
    int y;
    int klasse = -1;
    
    public Dataobjekt(int x, int y, int klasse){
        this.x = x;
        this.y = y;
        this.klasse = klasse;
    }
    public Dataobjekt(int x, int y){
        this.x = x;
        this.y = y;
        this.klasse = -1;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getKlasse() {
        return klasse;
    }
    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }

    @Override
    public String toString() {
        return "Dataobj [x=" + x + ", y=" + y + ", klasse=" + klasse + "]";
    }




}