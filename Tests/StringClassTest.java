import org.junit.Test;

import static org.junit.Assert.*;

public class StringClassTest {

    @Test
    public void abcTest1() {
        boolean result = StringClass.abcTest("123abc");
        assertEquals(true,result);
    }
    @Test
    public void abcTest2() {
        boolean result = StringClass.abcTest("123.abc");
        assertEquals(false,result);
    }
    @Test
    public void abcTest3() {
        boolean result = StringClass.abcTest("abc.123");
        assertEquals(true,result);
    }
    @Test
    public void abcTest4() {
        boolean result = StringClass.abcTest("");
        assertEquals(false,result);
    }
    @Test
    public void alternateStringsTest1() {
        String result = StringClass.alternateStrings("abc", "xyz");
        assertEquals("axbycz",result);
    }
    @Test
    public void alternateStringsTest2() {
        String result = StringClass.alternateStrings("Hi", "There");
        assertEquals( "HTihere",result);
    }
    @Test
    public void alternateStringsTest3() {
        String result = StringClass.alternateStrings("xxxx", "Thereee");
        assertEquals( "xTxhxexreee",result);
    }
    @Test
    public void alternateStringsTest4() {
        String result = StringClass.alternateStrings("Thereee", "xxxx");
        assertEquals( "Txhxexrxeee",result);
    }
    @Test
    public void alternateStringsTest5() {
        String result = StringClass.alternateStrings("", "");
        assertEquals( "",result);
    }



}