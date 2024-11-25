class Parkplatz {
    
    String parkplatzNr;
    int Hinweis;
    
    public Parkplatz(String parkplatzNr, int Hinweis) {
        this.parkplatzNr = parkplatzNr;
        this.Hinweis = Hinweis;
    }

    public String getParkplatzNr() {
        return parkplatzNr;
    }

    public void setParkplatzNr(String parkplatzNr) {
        this.parkplatzNr = parkplatzNr;
    }

    public int getHinweis() {
        return Hinweis;
    }

    public void setHinweis(int hinweis) {
        this.Hinweis = hinweis;
    }

    @Override
    public String toString() {
        return "Parkplatz [parkplatzNr=" + parkplatzNr + ", Hinweis=" + Hinweis + "]";
    }

    

}