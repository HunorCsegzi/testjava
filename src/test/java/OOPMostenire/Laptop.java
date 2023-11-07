package OOPMostenire;

public class Laptop {

    public String display;
    public String forma;
    public String model;
    public double pret;

    public Laptop(String display, String forma, String model, double pret) {
        this.display = display;
        this.forma = forma;
        this.model = model;
        this.pret = pret;
    }

    public void infoLaptop() {
        System.out.println("Display laptop:" + display);
        System.out.println("Forma:" + forma);
        System.out.println("model:" + model);
        System.out.println("Pret:" + pret);
    }
}
