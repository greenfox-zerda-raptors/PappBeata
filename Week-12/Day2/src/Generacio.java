
public class Generacio {

    private String[][] cells;

    public Generacio(String[][] input) {
        this.cells = input;
    }

    public Generacio createNextGeneracio() {
        return new Generacio(new String[][]{{".", "*", "*"},
                {".", "*", "*"},
                {".", "*", "*"}});
    }

    public int[][] countAliveNeighbours() {
        return null;
    }

    public boolean equals(Object o) {
        Generacio masik = ((Generacio) o);
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                if (!cells[i][j].equals(masik.cells[i][j]))
                    return false;
            }
        }
        return true;
    }

}
