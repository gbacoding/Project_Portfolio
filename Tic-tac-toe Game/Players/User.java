package Players;

import java.util.Scanner;

public class User extends Players {

    public static void main(String [] args){
    //Varibales INPUT
    String inputName;
    
    //Output variables


    //Constructor Player class
    Players user = new Players();

    // Constructor Scanner Class
    Scanner src = new Scanner(System.in);
    

    // DATA INPUT
    System.out.println("Introduce your name");
    inputName = src.nextLine();

    // PROCESSING
    user.setName(inputName);
    user.setSymbol("x");    

    

    // DATA OUTPUT


    

    }

}
