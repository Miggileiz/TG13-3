
public class MeineDaten {
int x;
int y;
Centroid c;



public MeineDaten(int x, int y) {
    this.x = x;
    this.y = y;
    c =null;
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



public Centroid getC() {
    return c;
}



public void setC(Centroid c) {
    this.c = c;
}



@Override
public String toString() {
    return "\tMeineDaten [x=" + x + ", y=" + y + ", c=" + c + "]\n";
}



}
