public class App {
    public static void main(String[] args) throws Exception {
        
        // Declare matrix
        String [][] gameMatrix = { {" "," "," "}, {" "," "," "}, {" "," "," "} };

        // Comprobar si hay una combinación ganadora (a partir del 5º turno (4- 0,1,2,3,4))
        User.init();
        User.yourTurn();
        // Mostrar tablero
        Board.displayBoard(gameMatrix);

        // Mensaje ganador perdedor
    }
}
