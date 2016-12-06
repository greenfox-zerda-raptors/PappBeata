import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Viktor on 2016.12.06..
 */
public class NumberConverterTests {
    @Test
    public void shouldReturnIfor1 (){
        assertEquals("I", NumberConverter.arabicToRoman(1));
    }

    @Test
    public void shouldReturnIIfor2 (){
        assertEquals("II", NumberConverter.arabicToRoman(2));
    }



}