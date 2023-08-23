
import javax.swing.JOptionPane;


public class User {
    
    //Atributes
    private String symbol;
    private String name;
    private static String inputName;
    static User user1 = new User();
    static int xPositionMark;
    static int yPositionMark;

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
        String welcomeMessage = JOptionPane.showInputDialog("Hi " + user1.getName()+"\n"+"Please, press any letter to start."); 
        
    }

    public static String yourTurn(String [][] matrix){
        String Introduction = JOptionPane.showInputDialog("Please indicate the coordinates of the square you want to mark."); 
        
        String xAxisPosition = JOptionPane.showInputDialog("X-Axis position (1-3 both included)"); 
        int intX_PositionMark = (Integer.parseInt(xAxisPosition))-1;
        xPositionMark = user1.toString(intX_PositionMark);

        String yAxisPosition = JOptionPane.showInputDialog("Y-Axis position (1-3 both included)");
        int intY_PositionMark = (Integer.parseInt(yAxisPosition))-1;
        yPositionMark = user1.toString(intY_PositionMark);

        return matrix [xPositionMark][yPositionMark];

    }

    private int toString(int intX_PositionMark) {
        return 0;
    }

}
