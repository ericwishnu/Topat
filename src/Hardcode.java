
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shan
 */
public class Hardcode {

    ArrayList<String> nonterminal = new ArrayList<String>();
    ArrayList<String> terminal = new ArrayList<String>();


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please enter your input");
        String [] a = checkInput(input);
       
       

    }
    
    public static String[] checkInput(String input){        
        String [] temp = input.split(" ");
        return temp;
    }
    
    public void check(String input){
        for(int i = 0; i<terminal.size();i++){
            if(input == terminal.get(i)){
                
            }
        }
        
    }


    private void Rules(String input) {
        String temp = "E";
        InititateRules();
        String [] result = checkInput(input);
        
        if(result[0].equals("id")){
            
        }
    }
    
    private void InititateRules(){
        //nonterminal array
        nonterminal.add("E");
        nonterminal.add("E'");
        nonterminal.add("T");
        nonterminal.add("T'");
        nonterminal.add("F");
        
        //terminal
        terminal.add("(");
        terminal.add("id");
        terminal.add("+");
        terminal.add("*");
        terminal.add(")");
        terminal.add("$");
        
        
    }
}
