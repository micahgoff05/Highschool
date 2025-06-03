/* Reused Functions */
import javax.swing.*;
public class functions{
   //Gets a double
   public static String numd(String question){
      //variables
      String input="", answer;
      double num=0;
      boolean valid=false;
      //Loop
      while(!valid){
         input = JOptionPane.showInputDialog(question);
         if(input.equals("?")) valid = true;
         if(input.equals("x")) valid = true;
         try{
            num = Double.parseDouble(input);
            valid = true; 
         }//end try
         //catch errors
         catch(Exception x){}//end catch
      }//end while
      if(!(input.equals("?")))answer = ""+num;
      else return "?";
      if(!(input.equals("x")))answer = ""+num;
      else return "x";
      return answer;
   }//end numd
      //main
   public static void main(String[]args){
      
   }//end main
}//end program
