import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeTest {

    @Test
    public void testFirst() throws Exception {
        Generacio result = new Generacio(new String[][]{{".", "*", "*"},
                {".", "*", "*"},
                {".", "*", "*"}});
        Generacio origin = new Generacio(new String[][]{{".", "*", "*"},
                {".", "*", "*"},
                {".", "*", "*"}});
        assertEquals(result, origin.createNextGeneracio());
    }

    @Test
    public void testEquals() throws Exception {
        Generacio g1 = new Generacio(new String[][]{{".", "*", "*"},
                {".", "*", "*"},
                {".", "*", "*"}});
        Generacio g2 = new Generacio(new String[][]{{".", "*", "*"},
                {".", "*", "*"},
                {".", "*", "*"}});
        assertTrue(g1.equals(g2));
    }

    @Test
    public void testNotEquals() throws Exception {
        Generacio g1 = new Generacio(new String[][]{{".", "*", "*"},
                {".", ".", "*"},
                {".", "*", "*"}});
        Generacio g2 = new Generacio(new String[][]{{".", "*", "*"},
                {".", "*", "*"},
                {".", "*", "*"}});
        assertFalse(g1.equals(g2));
    }

}
