package OOPMostenire;

import java.util.List;

public class Asus extends Laptop {
    public List<String> optiuniExterior;
    public Asus(String display, String forma, String model, double pret, List<String> optiuniExterior) {
        super(display, forma, model, pret);
        this.optiuniExterior = optiuniExterior;
    }
    public void infoAsus(){
        infoLaptop();
        System.out.println("Optiuni exterior:");
        for (int i=0; i<optiuniExterior.size(); i++){
            System.out.println(optiuniExterior.get(i));
        }
    }
}
