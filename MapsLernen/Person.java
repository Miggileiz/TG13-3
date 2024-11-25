package MapsLernen;



class Person{

    String name;
    String vorname;

    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  public String getVorname() {
        return vorname;
    }



    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public Person() {
    }

    @Override
    public String toString() {
       return "Person [name=" + name + ", vorname=" + vorname + "]";
    }

}
