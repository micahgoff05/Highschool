/*Micah Goff
Final for AP Programming
I'm going to take the physics program that I wrote and make it a class
5/26/2023*/
//I'm going to use inhertance - this will be struggle

public class Physics2{
   //instance variables
   private double v1, v2, a, x, t;
   
   //constructor
   public Physics2(){
      v1=0;
      v2=0;
      a=0;
      x=0;
      t=0;
   }//end constructor
   
   public Physics2(double V1, double V2, double A, double X, double T){
      v1=V1;
      v2=V2;
      a=A;
      x=X;
      t=T;
   }//end constructor
      
   public Physics2(double V1, double X, double T){
      v1=V1;
      x=X;
      t=T;      
   }//end constructor
   
   class Force extends Physics2{
   }//end Force subclass
   public static void fourEq(double v1, double v2, double a, double x, double t){
      
   }//end fourEq method
}//end Physics2 class
