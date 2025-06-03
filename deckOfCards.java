/*Micah Goff
3/15
Making a deck using an array*/

import javax.swing.*;

public class deckOfCards{
   public static void main(String[] args){
      String[] suit = {"hearts", "diamonds", "clubs", "spades"};
      Card[] deck = new Card[52];
      int index = 0;
      for(String s : suit){ //for each String in the suit array
         for(int i=1; i<=13; i++){
            deck[index] = new Card(i, s);
            System.out.println(deck[index]);
            index++;
         }//end for
      }//end for
   }//end main
}//end deck
