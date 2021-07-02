package ch.teko.prg2.day01.input.repetition;

public class Etui {
    //Attribute
    private String material;
    private String farbe;
    //primitiver Datentyp
    private double price;
    //Klassentyp
    private Füller[] füller;
    private Kugelschreiber[] kugelschreiber;
    private Bleistift[] bleistifte;
    private Farbstift[] farbstifte;

    //Konstruktoren
    public Etui(int anzFüller, int anzKugelschreiber, int anzBleistifte, int anzFarbstifte) {
        this();
        this.füller = new Füller[anzFüller];
        this.kugelschreiber = new Kugelschreiber[anzKugelschreiber];
        this.bleistifte = new Bleistift[anzBleistifte];
        this.farbstifte = new Farbstift[anzFarbstifte];
    }

    private Etui() {
        this.material = "Leder";
        this.farbe = "schwarz";
        this.price = 20.90;
    }

    //Methoden
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Füller[] getFüller() {
        return füller;
    }

    public void setFüller(Füller[] füller) {
        this.füller = füller;
    }

    public Kugelschreiber[] getKugelschreiber() {
        return kugelschreiber;
    }

    public void setKugelschreiber(Kugelschreiber[] kugelschreiber) {
        this.kugelschreiber = kugelschreiber;
    }

    public Bleistift[] getBleistifte() {
        return bleistifte;
    }

    public void setBleistifte(Bleistift[] bleistifte) {
        this.bleistifte = bleistifte;
    }

    public Farbstift[] getFarbstifte() {
        return farbstifte;
    }

    public void setFarbstifte(Farbstift[] farbstifte) {
        this.farbstifte = farbstifte;
    }

    public static void main(String[] args) {
        Etui etui = new Etui(1,3,4,5);
        etui.füller[0] = new Füller(14.90, 200);
    }

}
