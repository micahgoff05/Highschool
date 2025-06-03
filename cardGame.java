/*Micah Goff
Card Gameeeee
Summative*/
//Things left to do: 
   //make joke game

import javax.swing.*;
import java.util.*;
public class cardGame{
   //variables
   static int newMax=21;
   
   //populates an ArrayList of standard cards in a deck using the card class
   //@Param: Card ArrayList
   //@Return: none
   public static void createDeck(ArrayList<Card> a){
      String[] suit = {"spades", "hearts", "clubs", "diamonds"};
      for(int i=0; i<13; i++){
         for(String s : suit){//for each String in the suit array
            a.add(new Card((i+1), s));
         }//end for each loop
      }//end for loop
   }//end createDeck
   
   //takes an ArrayList and returns a single card
   //@Param: Card ArrayList
   //@Return: single card
   public static Card deal(ArrayList<Card> a){
      Card top = a.get(0);
      a.remove(0);
      return top;
   }//end deal
   
   //sets face cards to 10
   //@Param: ArrayList of Cards
   //@Return: none
   public static void set10s(ArrayList<Card> a){
      for(Card c: a){
         if(c.getFace().equals("J")||c.getFace().equals("Q")||c.getFace().equals("K")){
            c.setVal(10);
         }//end if 
      }//end for
   }//end set10s
   
   //asks if they want A to equal 1 or 11 and changes aces to the value and the max value for that player
   //@Param: ArrayList of Cards
   //@Return: none
   public static void checkAces(ArrayList<Card> a){
      String[] ace = {"1", "11"};
      int choice = JOptionPane.showOptionDialog(null, "You have an ace in your hand! Would you like for aces to be worth 1 or 11?"+
      "\nIf it is worth 1, you will go to 11. If it is worth 11, you will go to 21\nYour current total is: "+totalVal(a), 
      "ACE VALUE", 1, 1, null, ace, ace[1]);
      if(choice==0){
         newMax=11;
         for(Card c:a){
            if(c.getFace().equals("A")) c.setVal(1);
         }
      }//end if
      if(choice==1){
         newMax=21;
         for(Card c:a){
            if(c.getFace().equals("A")) c.setVal(11);
         }
      }
   }//end checkAces

   //returns true if there is an ace in the ArrayList
   //@Param: ArrayList of Cards
   //@Return: boolean
   public static boolean hasAce(ArrayList<Card> a){
      for(Card c:a){
         if(c.getFace().equals("A")) return true;
      }//end for
      return false;
   }//end hasAce
   
   //finds the total of the player's hand
   //@Param: ArrayList of Cards
   //@Return: int
   public static int totalVal(ArrayList<Card> a){
      int total=0;
      for(int i=0; i<a.size(); i++){
         total += a.get(i).getVal();
      }//end for
      return total;
   }//end totalPlayer
   
   //true if player (the first array) won
   //@Param: 2 ArrayLists of Cards
   //@Return: boolean
   public static boolean winner(ArrayList<Card> p, ArrayList<Card> d){
      if(newMax==11){
         if(totalVal(p)>11) return false;
         if(totalVal(d)>11) return true;
         if(totalVal(p)-11<totalVal(d)-21) return true;
         return false;
      }
      else{
         if(totalVal(p)>21) return false;
         if(totalVal(d)>21) return true;
         if(totalVal(p)>totalVal(d)) return true;
         return false;
      }
   }//end winner
   
//////////////////////MAIN//////////////////////
   public static void main(String[] args){
      //menu
      String[] butto = {"BlackJack", "Quit"};
      int menu = JOptionPane.showOptionDialog(null, "Would you like to play BlackJack?", "MENU", 1, 1, null, butto, butto[0]);      
      while(menu != 1){
         //Prep Deck: create ArrayList, create deck, and shuffle
         ArrayList<Card> deck = new ArrayList<Card>();
         createDeck(deck);
         Collections.shuffle(deck);
         set10s(deck);    
         //Deal Deck: create hand for dealer and player, and two cards to player and dealer  
         ArrayList<Card> dealer = new ArrayList<Card>();
         ArrayList<Card> player = new ArrayList<Card>();
         player.add(deal(deck));
         player.add(deal(deck));
         dealer.add(deal(deck));
         dealer.add(deal(deck)); 
         if(hasAce(player)) checkAces(player);
         
         //Do you want another card?
         int answer = 1;
         String[] butt = {"STAY", "HIT", "QUIT"};
         while(answer==1){
            if(totalVal(player)>newMax){
               JOptionPane.showMessageDialog(null, "Player has lost.\nPlayer: "+totalVal(player)+
                  "\nComputer: "+totalVal(dealer));
               break;
            }//end if
            answer = JOptionPane.showOptionDialog(null, "You currently have "+ player +
            " With a value of "+totalVal(player)+" \n                            Hit or Stay?", 
            "HIT?", 1, 1, null, butt, butt[0]);
            //stay
            if(answer==0){
               while(totalVal(player)>totalVal(dealer)&&totalVal(dealer)<=newMax){
                  dealer.add(deal(deck));
               }//end while
               if(winner(player, dealer)||totalVal(player)==totalVal(dealer)){
               JOptionPane.showMessageDialog(null, "Player has won! \n"
               +"Player: "+totalVal(player)+"\nComputer: "+totalVal(dealer));
               break;
               }//end if
               else{
                  JOptionPane.showMessageDialog(null, "Player has lost.\nPlayer: "+totalVal(player)+
                  "\nComputer: "+totalVal(dealer));
               }//end else
               break;
            }//end if
            
            //hit
            if(answer==1){
               player.add(deal(deck));
               if(player.get(player.size()-1).equals("A")) checkAces(player);
            }//end if
            else break;
         }//end while
         menu = JOptionPane.showOptionDialog(null, "Would you like to play BlackJack?", "MENU", 1, 1, null, butto, butto[0]);
      }//end main while
   }//end main
}//end cardGame
