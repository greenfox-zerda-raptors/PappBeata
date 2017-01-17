import org.junit.Test;

import static junit.framework.TestCase.*;


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

    @Test
    public void testCountAliveNeighbours() throws Exception {
        Generacio g1 = new Generacio(new String[][]{{".", "*", "*"},
                {".", "*", "*"},
                {".", "*", "*"}});

        int[][] excpected = new int[][]{{2, 3, 3},
                {3, 4, 4},
                {2, 2, 3}};
        assertEquals(excpected, g1.listAliveNeighbours());
    }

    @Test
    public void testEquals() throws Exception {
        Cell c1 = new Cell(true);
        Cell c2 = new Cell(true);
        assertEquals(true, c1.equals(c2));
    }

    @Test
    public void testNotEquals() throws Exception {

        assertEquals(excpected, g1.listAliveNeighbours());
    }
}
