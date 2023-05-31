package dubluri;

import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StabPersoanaTest {
    @Test
    void poateRezervaPachet(){
        IPersoana persoana = new StabPersoana();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Dubai",1500.0);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    void nuPoateRezervaPachet(){
        IPersoana persoana = new StabPersoana();
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Maldive",2000.0);
        assertFalse(pachetTuristic.poateRezerva());
    }



}