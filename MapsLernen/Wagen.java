package MapsLernen;

class Wagen {

    String marke;
    int kilo;
    public Wagen(String marke, int kilo) {
        this.marke = marke;
        this.kilo = kilo;
    }
    public String getMarke() {
        return marke;
    }
    public void setMarke(String marke) {
        this.marke = marke;
    }
    public int getKilo() {
        return kilo;
    }
    public void setKilo(int kilo) {
        this.kilo = kilo;
    } 

    @Override
    public String toString() {
       return "Wagen [name=" + marke + ", vorname=" + kilo + "]";
    }

}
