/*Micah Goff
Physics Class for fun */

public class Physics{
   //instance variables
      //variables for 4 equations
      private Double velocity1, velocity2, acceleration, distance, time;
      
   //constructor
   //makes all values zero
   public Physics(){
      velocity1 = 0.0;
      velocity2 = 0.0;
      acceleration = 0.0;
      distance = 0.0;
      time = 0.0;
   }
  
   //v1, v2, a, x, t
   public Physics(double v1, double v2, double a, double x, double t){
      velocity1 = v1;
      velocity2 = v2;
      acceleration = a;
      distance = x;
      time = t;
   } 
        
   //setter/mutator
   public void setv1(double v1){
      velocity1 = v1;
   }
   public void setv2(double v2){
      velocity2 = v2;
   }
   public void seta(double a){
      acceleration = a;
   }
   public void setx(double x){
      distance = x;
   }
   public void sett(double t){
      time = t;
   }
   //calculator + return
      //x, v, t
         //x
         public static double findx(double v, double t){
            double x = v*t;
            return x;
         }
         //v
         public static double findv(double x, double t){
            double v = x/t;
            return v;
         }
         //t
         public static double findt(double x, double v){
            double t = x/v;
            return t;
         }
      //v1, v2, a, x, t
         //v1?
         public static double findv1(Double V2, Double A, Double X, Double T){
            double v1, v2, a, x, t;
            if(V2.equals(null)){
               v1 = ((X-((A/2)*(T*T)))/T); 
               return v1; 
            } 
            else if(A==null){
               v1 = (2*X/T-V2);
               return v1;
            }
            else if(X==null){
               v1 = (V2-A*T);
               return v1;
            }
            else if(T==null){
               v1 = Math.sqrt(V2*V2-2*A*X);
               return v1;
            }
            else{
               v1 = Math.sqrt(V2*V2-2*A*X);
               return v1; 
            }
         }//end findv1
         //v2?
         public static double findv2(Double V1, Double A, Double X, Double T){
            double v1, v2, a, x, t;
            if(A==null){
               v2 = (2*X/T-V1);
               return v2;
            }
            else if(X==null){
               v2 = (V1+A*T);
               return v2;
            }
            else if(T==null){
               v2 = Math.sqrt(V1*V1+2*A*X);
               return v2;
            }
            else{
               v2 = Math.sqrt(V1*V1+2*A*X);
               return v2;
            }
         }//end findv2
         public static double finda(Double V1, Double V2, Double X, Double T){
            double v1, v2, a, x, t;
            if(V2==null){
               a = (2*((X-(V1*T))/(T*T)));
               return a;
            }
            else if(X==null){
               a = ((V2-V1)/T);
               return a;
            }
            else if(T==null){
               a = ((V2*V2-V1*V1)/2/X);
               return a;
            }
            else{
               a = ((V2*V2-V1*V1)/2/X);
               return a;
            }
         }//end finda
         public static double findx(Double V1, Double V2, Double A, Double T){
            double v1, v2, a, x, t;
            if(V2==null){
               x = ((V1*T)+((A/2)*(T*T)));;
               return x;
            }
            else if(A==null){
               x = ((V1+V2)/2*T);
               return x;
            }
            else if(T==null){
               x = ((V2*V2-V1*V1)/2/A);
               return x;
            }
            else{
               x = ((V2*V2-V1*V1)/2/A);
               return x;
            }
         }//end findx
         public static double findt(Double V1, Double V2, Double A, Double X){
            double v1, v2, a, x, t;
            if(V2==null){
               t = (((V1*V1 + 2*A*X)-V1)/A);
               return t;
            }
            else if(A==null){
               t = (2*X/(V1+V2));
               return t;
            }
            else if(X==null){
               t = ((V2-V1)/A);
               return t;
            }
            else{
               t = ((V2-V1)/A);
               return t;
            }
         }//end findt
   
   //accessor
   public double getx(){
      return distance;
   }
   public double getv(){
      return velocity1;
   }
   public double gett(){
      return time;
   }
   
   //toString
   public String toString(){
      return "V1 = "+velocity1 +"\n" + "V2 = "+velocity2 +"\n" +"A = "+acceleration 
      + "\n" + "X = "+distance +"\n" +"T = " + time;
   }
}//end physics
