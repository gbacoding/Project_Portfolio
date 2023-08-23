public class Board {

    /** buildes **/
    Board () {
    }
    
    /** 
     * Displays the current state of the game board on the console 
     */
    static void displayBoard(String [][] matrix){ 
        System.out.println("BOARD");  
        System.out.println("-----"); 
        for(String [] row: matrix){
            for (String element: row){
                System.out.print(element+ " ");
                
            }
            System.out.println();
       
        }
    }

}
