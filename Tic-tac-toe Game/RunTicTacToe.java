package execution;

import java.lang.*;
import java.util.Scanner;

public class RunTicTacToe {

    public enum  Player {PLAYER_1, BOT};

    public static void main(String[] args) {
       
        //Variables Constantes
        final String[] SECUENCIA_GANADDORA_P1 = {"x", "x", "x"};
        final String[] SECUENCIA_GANADDORA_BOOT = {"O", "O", "O"};

        //Variable de entrada
        String symbol;
        int row, column;

        //Variable de salida

        //Variable Auxiliar
        boolean finish = false, checkInput = false;
        String symbolP1 = "x";

        //Class Scanner
        Scanner input = new Scanner (System.in);

        // DATA INPUT

        do {
            System.out.println("Tu turno!");
            System.out.println("Introduce el simbolo 'x' para ocupar una casilla");
            symbol = input.nextLine();  
            if (symbol.equals(symbolP1)){
                checkInput = true;
            } else {
                checkInput = false;
                System.err.println("Letra introducida incorrecta.");
            }
        } while (!checkInput);

        do {
        System.out.println("Introduce la FILA en la que colocarás la x " + 
        "valores permitidos 1-3");
        row = input.nextInt();
       //x input.close();
            if (row<1 || row>3){
                System.out.println("Valor introducido fuera de rango.");
            }
        } while (row>=1 && row<=3);

        System.out.println("Introduce la COLUMNA en la que colocarás la x" + 
         " valores permitidos 1-3");
        column = input.nextInt();
       
        if (row<1 && row>3){
                System.out.println("Valor introducido fuera de rango.");
        }


        //} while (row>=1 && row<=3 && column >=1 && column<=3);
        input.close();
        //PROCESSING


        // DATA OUTPUT
    }


}
