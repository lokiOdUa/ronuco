package info.dvad.ronuco;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by loki.od.ua on 10.01.2016.
 */
public class mainTest {
    @Test
    public void testCheckRoman(){
        assertEquals(-1, main.checkRoman("1234567890"));
        assertEquals(-1, main.checkRoman("qwerty"));
        assertEquals(0, main.checkRoman("III"));
        assertEquals(0, main.checkRoman("MCMXLIV"));
        assertEquals(0, main.checkRoman("MMVI"));
    }
    @Test
    public void testToNumber(){
        assertEquals(0, main.toNumber(""));
        assertEquals(3, main.toNumber("III"));
        assertEquals(42, main.toNumber("XLII"));
        assertEquals(1944, main.toNumber("MCMXLIV"));
        assertEquals(1978, main.toNumber("MCMLXXVIII"));
        assertEquals(2006, main.toNumber("MMVI"));
        assertEquals(2048, main.toNumber("MMXLVIII"));
    }
}
