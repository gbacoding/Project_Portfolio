public class App {
    public static void main(String[] args) throws Exception {
        
        // Formacion de la matriz del tablero
        String [][] gameMatrix = { {"0","0","X"}, {"X","0","X"}, {"0","X","X"} };

        // Comprobar si hay una combinación ganadora (a partir del 5º turno (4- 0,1,2,3,4))

        // Mostrar tablero
        Board.displayBoard(gameMatrix);

        // Mensaje ganador perdedor
    }
}
