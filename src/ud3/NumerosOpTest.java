package ud3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumerosOpTest {
    

    @Test
    void testSumaDigitos() {
        assertEquals(6, NumerosOp.sumaDigitos(123));
        assertEquals(1, NumerosOp.sumaDigitos(1));
        assertEquals(10, NumerosOp.sumaDigitos(190));
    }
}
