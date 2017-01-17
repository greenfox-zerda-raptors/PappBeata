
public class Generacio {

    private Cell[][] cells;

    public Generacio(String[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                if (input[i][j].equals(".")) {
                    cells[i][j] = new Cell(false);
                }
                cells[i][j] = new Cell(true);
            }
        }
        cells = input;
    }

    public Generacio createNextGeneracio() {
        int[][] countedNeighbours = listAliveNeighbours();
        return null;
    }

    public int[][] listAliveNeighbours() {
        int aliveNeighbours = 0;
        int[][] output = new int[cells.length][cells[0].length];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                output[i][j] = cells[i][j].countAliveNeighbours();
            }
        }
        return null;
    }

    public int countAliveNeighbours() {
        return 0;
    }

    public boolean equals(Object o) {
        return alive == ((Cell) o.alive);
    }
}
