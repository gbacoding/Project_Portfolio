public class Board {

    /** buildes **/
    Board () {
    }
    
    /** This Method traverse the String Array of the game in a graphic mode **/
    static void print(String [][] matrix){    
        for(String [] row: matrix){
            for (String element: row){
                System.out.print(element+ " ");
            }
            System.out.println();
        }
    }
}
