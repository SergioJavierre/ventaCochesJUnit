import com.sergiojavierre.modelos.Coche;
import org.junit.Test;

import static org.junit.Assert.*;


public class CocheTest {

    @Test
    public void pruebaRepostaje(){
        Coche c = new Coche("1234");
        int repostaje = 100;
        c.reposta(repostaje);
        int combustibleActual = c.getFuel();
        Boolean mayorOIgual = combustibleActual >= repostaje;
        assertTrue(mayorOIgual);
    }

    @Test
    public void conduceHastaDestino() {
        Coche opel = new Coche("1234 ABC");
        opel.reposta(100);
        Boolean llega = opel.conduceHastaDestino(90);
        assertEquals(true, llega);
    }
}