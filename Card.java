/*Micah Goff
Card Class
Unit 3: Classes - Summative*/

public class Card{
   //instance variables
   private int value;
   private String suit, face;
   
   //constructor
   public Card(){
      value = 0;
      suit = "";
      face = "";
   }
   public Card(int v, String s){
      value = v;
      suit = s;
      switch(value){
         case 13: face = "K"; break;
         case 12: face = "Q"; break;
         case 11: face = "J"; break;
         case 1: face = "A"; break;
         default: face = v+"";
      }//end switch
   }
   public Card(String v, String s){
   suit = s;
   switch(v){
      case "13": face = "K"; break;
      case "12": face = "Q"; break;
      case "11": face = "J"; break;
      case "1": face = "A"; break;
      default: face = v;
   }//end switch
   try{value = Integer.parseInt(v);}
   catch(Exception E){value = 0;}
   
      switch(v){
         case "K": value = 13; break;
         case "Q": value = 12; break;
         case "J": value = 11; break;
         case "A": value = 1; break;
      }//end switch
   }
   public Card(int v, String s, String f){
      value = v;
      suit = s;
      face = f;
   }
   
   //setter
   public void setVal(int v){
      value = v;
   }
   public void setSuit(String s){
      suit = s;
   }
   public void setFace(String f){
      face = f;
   }
   
   //accessor
   public int getVal(){
      return value;
   }
   public String getSuit(){
      return suit;
   }  
   public String getFace(){
      return face;
   }
   
   //mutator
   public void newVal(int v){
      value = v;
   }
   public void newSuit(String s){
      suit = s;
   }
   public void newFace(String f){
      face = f;
   }
   
   //toString
   public String toString(){
      return face+" of "+suit;
   }

}//end Card class
