
import java.util.*;

public class Centroid extends MeineDaten {


    List<MeineDaten> d;
    String name;



    public Centroid(int x, int y, String name) {
        super(x, y);
        this.name = name;
        d = new ArrayList<>();
    }

    public void addData (MeineDaten dp){
        d.add(dp);
    }
    
    public void removeAllData (){
        d.clear();
    }

    @Override
    public String toString() {
        return "Centroid [x=" + x + ", y=" + y + ", d=" + d + ", name=" + name + "]";
    }





}
