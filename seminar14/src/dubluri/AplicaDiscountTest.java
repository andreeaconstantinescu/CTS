package dubluri;

import categorii.Categorie1;
import categorii.Categorie2;
import clase.PachetTuristic;
import jdk.jfr.Category;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AplicaDiscountTest {

   // @Category(Categorie1.class)
    @Test
   public void poatePrimiDiscount(){
        FakePersoana persoana = new FakePersoana();
        persoana.setGetVarsta(66);
        PachetTuristic pachet = new PachetTuristic(persoana,"Baile Felix",1000.0);
        pachet.aplicaDiscountVarstnici(20);
        assertEquals(800,pachet.getPret());
    }

   // @Category(Categorie2.class)
    @Test
    public void nuPoatePrimiDiscount(){
        FakePersoana persoana = new FakePersoana();
        persoana.setGetVarsta(25);
        PachetTuristic pachet = new PachetTuristic(persoana,"Baile Felix",1000.0);
        pachet.aplicaDiscountVarstnici(20);
        assertEquals(800,pachet.getPret());
    }
}
