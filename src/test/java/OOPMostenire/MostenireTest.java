package OOPMostenire;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MostenireTest {
    @Test
    public void metodaTest(){
        List<String> optiuniAsus = new ArrayList<>() ;
        optiuniAsus.add("dungaled");
        optiuniAsus.add("tastatura internationala");
        optiuniAsus.add("camera web");
        Asus g14 = new Asus ("Oled", "dreptunghiulara", "G134", 5000, optiuniAsus);
        g14.infoAsus();
    }
}
