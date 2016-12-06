import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberConverterTests {
    @Test
    public void shouldReturnIfor1 (){
        assertEquals("I", NumberConverter.arabicToRoman(1));
    }
    @Test
    public void shouldReturnIIfor2 (){
        assertEquals("II", NumberConverter.arabicToRoman(2));
    }
    @Test
    public void shouldReturnIIIfor3 (){
        assertEquals("III", NumberConverter.arabicToRoman(3));
    }
    @Test
    public void shouldReturnIIIfor4 (){
        assertEquals("IV", NumberConverter.arabicToRoman(4));
    }
    @Test
    public void shouldReturnVfor5 (){
        assertEquals("V", NumberConverter.arabicToRoman(5));
    }
    @Test
    public void shouldReturnVIfor6 (){
        assertEquals("VI", NumberConverter.arabicToRoman(6));
    }
    @Test
    public void shouldReturnVIIfor7 (){
        assertEquals("VII", NumberConverter.arabicToRoman(7));
    }
    @Test
    public void shouldReturnVIIIfor8 (){
        assertEquals("VIII", NumberConverter.arabicToRoman(8));
    }
    @Test
    public void shouldReturnIXfor9 (){
        assertEquals("IX", NumberConverter.arabicToRoman(9));
    }
    @Test
    public void shouldReturnXfor10 (){
        assertEquals("X", NumberConverter.arabicToRoman(10));
    }
    @Test
    public void shouldReturnXIfor11 (){
        assertEquals("XI", NumberConverter.arabicToRoman(11));
    }
    @Test
    public void shouldReturnXIIfor12 (){
        assertEquals("XII", NumberConverter.arabicToRoman(12));
    }
    @Test
    public void shouldReturnXIVfor14 (){
        assertEquals("XIV", NumberConverter.arabicToRoman(14));
    }
    @Test
    public void shouldReturnXIXfor19 (){
        assertEquals("XIX", NumberConverter.arabicToRoman(19));
    }
    @Test
    public void shouldReturnXXfor20 (){
        assertEquals("XX", NumberConverter.arabicToRoman(20));
    }
}