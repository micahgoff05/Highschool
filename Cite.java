/*Micah Goff
Our own Class*/
public class Cite{
   //instance variables
   private String name; 
   private int start, end;
   private static String first, last;
   
   //constructors allow for user to create object
   public Cite(){
      name = "Book";
   }
   //last name
   public Cite (String x, String y){
      first = x;
      last = y;
      start = 0;
      end = 0; 
   }
   //last name, start page, end page
   public Cite (String x, String y, int z, int a){
      first = x;
      last = y;
      start = z;
      end = a;
   }
   //methods
   public String toString(){
      return "("+name+" "+start+"-"+end+")";
   }//end toString
  
   //accessor methods
   public String getName(){
      return name;
   }//end getName
   
   public int startPage(){
      return start;
   }//end startPage
   
   public int endPage(){
      return end;
   }//end endPage
   
   //mutator methods
   public void setName(String n){
      name = n;
   }//end mutator methods
   
   //equals method compares 2 authors
   public boolean equals(Cite s){
      if(this.name.equals(s.name)&&
      this.start==s.start&&
      this.end==s.end) return true;
      return false;
   }//end equals method
   
   //static method
   public static void changeAuthor(String t){
      name = t;
   }
   
}//end class Cite
