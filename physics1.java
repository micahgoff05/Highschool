/*Micah Goff 
Final Project - Hacks (ha) for Advanced Physics*/

import javax.swing.*;
public class physics1{
   public static void menu(){
      String[] butt = {"1: Linear Mechanics", "Quit", "2: Rotation Mechanics", "3: Electricity & Circuits",
      "4: Electromagnetism", "5: Theory of Special Relativity"};
      int select = JOptionPane.showOptionDialog(null, "What Unit Would You Like To Look At?", 
      "ADVANCED PHYSICS HACKS", 0, 1, null, butt, butt[0]);
     while(select!=1){ 
     //unit 1 menu
      if(select == 0){
      String[] butto = {"I: Motion", "II: Force", "III: Equalibrium"};
      int s1 = JOptionPane.showOptionDialog(null, "What Section Would You Like To Look At?", 
      "UNIT 1: LINEAR MOTION", 0, 1, null, butto, butto[0]);   
         //Motion
         if(s1 == 0){
         String v1, v2, a, x, t;
         String[] but = {"X = VT", "4 Equations"};
         int lm = JOptionPane.showOptionDialog(null, "What Equations do you need?", null, 0, 1, null, but, but[0]);
         //x=vt
         if(lm == 0){
         v1 = functions.numd("Enter V in m/s \n (? if answer)");
         x = functions.numd("Enter X in m \n (? if answer)");
         t = functions.numd("Enter T in s \n (? if answer)");
         //Convert +try/catch
         double V1=0, V2=0, A=0, X=0, T=0, answer;
          try {//V
          V1 = Double.parseDouble(v1);
          }//end try
          catch(Exception e){}
          try {//X
          X = Double.parseDouble(x);
          }//end try
          catch(Exception h){}
          try {//T
          T = Double.parseDouble(t);
          }//end try
          catch(Exception i){}; 
             //solve for v
             if(v1.equals("?")){
             answer = X/T;
             JOptionPane.showMessageDialog(null, "V = " + answer +" m/s");
             }//end if
             //solve for x
             if(x.equals("?")){
             answer = (V1*T);
             JOptionPane.showMessageDialog(null, "X = " + answer +" m");
             }//end if
             //solve for t
             if(t.equals("?")){
             answer = (X/V1);
             JOptionPane.showMessageDialog(null, "T = " + answer+" s");
             }//end if
            }//end if (x=vt)
         //4 Equations
         if(lm == 1){
              v1 = functions.numd("Enter V1 in m/s \n (? if answer) (x if irrelevant)");
              v2 = functions.numd("Enter V2 in m/s \n (? if answer) (x if irrelevant)");
              a = functions.numd("Enter A in m/s^2 \n (? if answer) (x if irrelevant)");
              x = functions.numd("Enter X in m \n (? if answer) (x if irrelevant)");
              t = functions.numd("Enter T in s \n (? if answer) (x if irrelevant)");
              double V1=0, V2=0, A=0, X=0, T=0, answer;
            try {//V1
               V1 = Double.parseDouble(v1);
               }//end try
               catch(Exception e){}
            try {//V2
               V2 = Double.parseDouble(v2);
               }//end try
               catch(Exception f){}
            try {//A
               A = Double.parseDouble(a);
               }//end try
               catch(Exception g){}
            try {//X
               X = Double.parseDouble(x);
               }//end try
               catch(Exception h){}
            try {//T
            T = Double.parseDouble(t);
            }//end try
            catch(Exception i){};
             //no v2 (x = vt+1/2at^2)
               //x?
               if(v2.equals("x")&&x.equals("?")){
               answer = ((V1*T)+((A/2)*(T*T)));
               JOptionPane.showMessageDialog(null, "X = " + answer+" m");
               }//end if
               //a?
               if(v2.equals("x")&&a.equals("?")){
               answer = (2*((X-(V1*T))/(T*T)));
               JOptionPane.showMessageDialog(null, "A = " + answer+" m/s^2");
               }//end if
               //v1?
               if(v2.equals("x")&&v1.equals("?")){
               answer = ((X-((A/2)*(T*T)))/T);
               JOptionPane.showMessageDialog(null, "V1 = " + answer+" m/s");
               }//end if
               //t?
               if(v2.equals("x")&&t.equals("?")){
               answer = (((V1*V1 + 2*A*X)-V1)/A);
               JOptionPane.showMessageDialog(null, "T = " + answer+" s");
               }//end if  
            //no a (x = 1/2(v1+v2)t)
               //v1?
               if(a.equals("x")&&v1.equals("?")){
               answer = (2*X/T-V2);
               JOptionPane.showMessageDialog(null, "V1 = " + answer+" m/s");
               }//end if
               //v2?
               if(a.equals("x")&&v2.equals("?")){
               answer = (2*X/T-V1);
               JOptionPane.showMessageDialog(null, "V2 = " + answer+" m/s");
               }//end if
               //x?
               if(a.equals("x")&&x.equals("?")){
               answer = ((V1+V2)/2*T);
               JOptionPane.showMessageDialog(null, "X = " + answer+" m");
               }//end if
               //t?
               if(a.equals("x")&&t.equals("?")){
               answer = (2*X/(V1+V2));
               JOptionPane.showMessageDialog(null, "T = " + answer+" s");
               }//end if
            //no x (v2 = v1 + at)
               //v1?
               if(x.equals("x")&&v1.equals("?")){
               answer = (V2-A*T);
               JOptionPane.showMessageDialog(null, "V1 = " + answer+" m/s");
               }//end if
               //v2?
               if(x.equals("x")&&v2.equals("?")){
               answer = (V1+A*T);
               JOptionPane.showMessageDialog(null, "V2 = " + answer+" m/s");
               }//end if
               //a?
               if(x.equals("x")&&a.equals("?")){
               answer = ((V2-V1)/T);
               JOptionPane.showMessageDialog(null, "A = " + answer+" m/s^2");
               }//end if
               //t?
               if(x.equals("x")&&t.equals("?")){
               answer = ((V2-V1)/A);
               JOptionPane.showMessageDialog(null, "T = " + answer+" s");
               }//end if
            //no t (v2^2 = v1^2 + 2ax) 
               //v1?
               if(t.equals("x")&&v1.equals("?")){
               answer = Math.sqrt(V2*V2-2*A*X);
               JOptionPane.showMessageDialog(null, "V1 = " + answer+" m/s");
               }//end if
               //v2?
               if(t.equals("x")&&v2.equals("?")){
               answer = Math.sqrt(V1*V1+2*A*X);
               JOptionPane.showMessageDialog(null, "V2 = " + answer+" m/s");
               }//end if
               //a?
               if(t.equals("x")&&a.equals("?")){
               answer = ((V2*V2-V1*V1)/2/X);
               JOptionPane.showMessageDialog(null, "A = " + answer+" m/s^2");
               }//end if
               //x? 
               if(t.equals("x")&&x.equals("?")){
               answer = ((V2*V2-V1*V1)/2/A);
               JOptionPane.showMessageDialog(null, "X = " + answer+" m");
               }//end if
            //missing single variable
               //v1
                if(v1.equals("?")&&!v2.equals("x")&&!a.equals("x")&&!x.equals("x")&&!t.equals("x")){
                  answer = Math.sqrt(V2*V2-2*A*X);
                  JOptionPane.showMessageDialog(null, "V1 = "+answer+" m/s");
                }//end if
               //v2
                if(v2.equals("?")&&!v1.equals("x")&&!a.equals("x")&&!x.equals("x")&&!t.equals("x")){
                  answer = Math.sqrt(V1*V1+2*A*X);
                  JOptionPane.showMessageDialog(null, "V2 = "+answer+" m/s");
                }//end if
               //a
                if(a.equals("?")&&!v1.equals("x")&&!v2.equals("x")&&!x.equals("x")&&!t.equals("x")){
                  answer = ((V2*V2-V1*V1)/2/X);
                  JOptionPane.showMessageDialog(null, "A = "+answer+" m/s^2");
                }//end if
               //x
                if(x.equals("?")&&!v1.equals("x")&&!v2.equals("x")&&!a.equals("x")&&!t.equals("x")){
                  answer = ((V2*V2-V1*V1)/2/A);
                  JOptionPane.showMessageDialog(null, "X = "+answer+" m");
                }//end if
               //t
                if(t.equals("?")&&!v1.equals("x")&&!v2.equals("x")&&!a.equals("x")&&!x.equals("x")){
                  answer = ((V2-V1)/A);
                  JOptionPane.showMessageDialog(null, "T = "+answer+" s");
                }//end if
            }//end if (4 equations)
         }//end if (motion)
         //Force
         if(s1 == 1){
          //variables
          String f, m, a, fg="";
          String[] bu = {"F = MA", "Horizontal FBD"};
          int force = JOptionPane.showOptionDialog(null, "What Equations do you need?", null, 0, 1, null, bu, bu[0]);
          //f=ma
          if(force == 0){
          f = functions.numd("Enter F in N \n (? if answer)");
          m = functions.numd("Enter M in kg \n (? if answer) (x if you have fg)");
          if(m.equals("x")){
            fg = functions.numd("Enter fg in kg");
          }//end if
          a = functions.numd("Enter A in m/s^2 \n (? if answer)");
          //try/catch
          double F=0, M=0, A=0, FG=0, answer;
            try {//F
               F = Double.parseDouble(f);
               }//end try
               catch(Exception e){}
            try {//M
               M = Double.parseDouble(m);
               }//end try
               catch(Exception g){}
            try {//A
               A = Double.parseDouble(a);
               }//end try
               catch(Exception h){}
            try{
              FG = Double.parseDouble(fg);
              }//end try
              catch(Exception i){}
            //fg-->M
            if(m.equals("x")){
              M = (FG*9.8);
            }//end if
            //f?
            if(f.equals("?")){
              answer = (M*A);
              JOptionPane.showMessageDialog(null, "F = "+answer+" N");
            }//end if
            //m?
            if(m.equals("?")){
              answer = F/A;
              JOptionPane.showMessageDialog(null, "M = "+answer+" kg");
            }//end if
            //a?
            if(a.equals("?")){
              answer = F/M;
              JOptionPane.showMessageDialog(null, "A = "+answer+" m/s^2");
            }//end if
          }//end if (f=ma)
          //Horizontal FBD
          if(force == 1){
            //variables
            
            //ask for numbers
            //try/catch
            //solve/print
              //f total?
              //mass?
              //f of friction?
              //distance
              //time
          }//end if (horizontal FBD)
      }//end if (force)
   }//end if (unit one)
select = JOptionPane.showOptionDialog(null, "What Unit Would You Like To Look At?", 
      "ADVANCED PHYSICS HACKS", 0, 1, null, butt, butt[0]);
   }//end massive while
   }//end menu
   
     public static void main(String[]args){
      //Menu
      menu();
   }//end main
}//end physics
