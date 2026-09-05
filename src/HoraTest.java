import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class HoraTest {

    private Hora h1;

    /*
    @BeforeEach 
    void setUp(){
        Hora h1 = new Hora(0, 0, 0);
    }
    */

    @Test
    public void testaInvalido(){

        h1 = new Hora(24, 0, 0);

        assertEquals("00:00:00", h1.horaFormatada());
    }

    @Test 
    @DisplayName ("Testa incrementar")
    public void testaIncrementarHora(){

        h1 = new Hora(12, 0, 0);

        h1 = h1.incrementar(70);

        assertEquals("13:10:00", h1.horaFormatada());
    }

    @Test 
    public void testaSeUmaHoraEstaNaFrenteDaOutra(){

        h1 = new Hora(1, 0, 0);
        Hora h2 = new Hora(0, 0, 0);

        assertTrue(h1.estahNaFrenteDe(h2));
    }

    @Test
    public void testaFormatacaoCorreta(){

        h1 = new Hora(21, 12, 21);

        assertEquals("21:12:21", h1.horaFormatada());
    }
}
