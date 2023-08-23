
import javax.swing.JOptionPane;

public class User {
    
    //Atributes
    private String symbol;
    private String name;
    private static String inputName;
    static User user1 = new User();

    //Methods

    User () {
    }

    void setName(String name){
        this.name = name;
    }

    //Getter method to set name
    String getName(){
        return name;
    }

    //Setter method to set symbol
    void setSymbol(String symbol){
        this.symbol = symbol;
    }

    //Getter method to set symbol
    String getSymbol(){
        return symbol;
    }

    public static void init () {
        inputName = JOptionPane.showInputDialog("Please, enter you name.");
        user1.setName(inputName);
        user1.setSymbol("X");    
    }

    public static void yourTurn(){
        String welcomeMessage = JOptionPane.showInputDialog("Hi " + user1.getName());

    }

}
