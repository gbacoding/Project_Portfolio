package Players;

import javax.swing.JOptionPane;

public class User extends Players {

    User () {
    }

    static void init () {
    //Varibales INPUT
    String inputName;
 
    //Constructor Player class
    User user1 = new User();

    // DATA INPUT
    System.out.println("Introduce your name");
    inputName = JOptionPane.showInputDialog("Please, enter you name.");

    // PROCESSING
    user1.setName(inputName);
    user1.setSymbol("X");    

    }

}
