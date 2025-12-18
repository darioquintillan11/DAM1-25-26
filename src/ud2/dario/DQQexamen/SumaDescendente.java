package ud2.dario.DQQexamen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumaDescendente {
    /**
     * 
     * @author Darío Quintillán
     */
    public static int sumaDescendente(int numero) {
        int resto = 0;
        int sumaTotal = numero;
        for (int j = 1; j < numero; j *= 10) {
            resto = numero % j;
            sumaTotal += resto;
        }
        return sumaTotal;
    }   
    

     @Test
    public void testsumaDescendente() {
        assertEquals(5242, sumaDescendente(4578));
        assertEquals(5252, sumaDescendente(5083));
        assertEquals(1107, sumaDescendente(999));
        assertEquals(108, sumaDescendente(99));
        assertEquals(9, sumaDescendente(9));
        assertEquals(44444+4444+444+44+4, sumaDescendente(44444));        
        assertEquals(5444444+444444+44444+4444+444+44+4, sumaDescendente(5444444));         

        assert sumaDescendente(4321) == 4321 + 321 + 21 + 1;
        assert sumaDescendente(100) == 100 + 0 + 0;
        assert sumaDescendente(7) == 7;
        assert sumaDescendente(0) == 0;
        assert sumaDescendente(12345) == 12345 + 2345 + 345 + 45 + 5;
    }

}
