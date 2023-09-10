public class MazeSolver {
    private int[][] maze;
    private int[][] solution;
    private int rows;
    private int cols;

    public MazeSolver(int[][] maze) {
        this.maze = maze;
        this.rows = maze.length;
        this.cols = maze[0].length;
        this.solution = new int[rows][cols];
    }

    public void solveMaze() {
        if (solve(0, 0)) {
            printSolution();
        } else {
            System.out.println("No hay solución para el laberinto.");
        }
    }

    private boolean solve(int x, int y) {
        // Verificar si hemos alcanzado la posición de destino
        if (x == rows - 1 && y == cols - 1 && maze[x][y] == 1) {
            solution[x][y] = 1;
            return true;
        }

        // Verificar si la posición actual es válida
        if (isValid(x, y)) {
            // Marcar la posición actual como parte de la solución
            solution[x][y] = 1;

            // Moverse hacia adelante (derecha)
            if (solve(x, y + 1)) {
                return true;
            }

            // Moverse hacia abajo
            if (solve(x + 1, y)) {
                return true;
            }

            // Si no hay camino válido desde esta posición, retroceder
            solution[x][y] = 0;
        }

        return false;
    }

    private boolean isValid(int x, int y) {
        // Verificar si la posición está dentro de los límites del laberinto
        return (x >= 0 && x < rows && y >= 0 && y < cols && maze[x][y] == 1);
    }

    private void printSolution() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        MazeSolver solver = new MazeSolver(maze);
        solver.solveMaze();
    }
}