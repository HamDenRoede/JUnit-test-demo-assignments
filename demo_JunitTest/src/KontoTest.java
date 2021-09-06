import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


    //todo:
    //1 test for ikke at hæve mere end saldo
    //2 test for negativt beløb
    //3 test for 0 hævebeløb
    //4 test for overskridelse af daglig begrænsning

class KontoTest
{
    Konto konto = new Konto("nik", 100);

    @Test
    void testInsert()
    {
        assertEquals(113, konto.insert(113));
    }

    @Test
    void testZeroWithdraw()
    {
        assertEquals(0, konto.withdraw(100));
    }

    @Test
    void testForNegativeWithdraw()
    {
        assertEquals(-100, konto.withdraw(100));
    }

    @Test
    void testForOverWithdraw()

}