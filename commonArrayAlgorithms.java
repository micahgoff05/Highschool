import javax.swing.*;
import java.util.*;

public class commonArrayAlgorithms{
  // Task 1: A function that puts a random number between 1-13 into the array
  //for the length of the array
   public static void fillArray(int[] a){ 
   /*WRITE A FOR LOOP HERE TO FILL THE ARRAY*/
      for(int i=0; i<a.length; i++){
      a[i] = (int)(Math.random()*13)+1;
      }//end for
   }//end fillArray
  
  
  
  //Task 2: write a stringFormat function that will return all of the elements in an int array 
  //nicely formatted as a String.
  //parameter: int[] array
  //return: String
  
   public static String stringFormat(int[] a){
      String output = "[";
      for(int n : a){//"for each loop" - for(each integer in the array)
      output += n+ " ";
      }
      return output+"]";
   }

   //Task 3: write a function called increment that will add one to the value sent as an argument
   //parameter: int
   //return: nothing
   public static void increment(int a){
      a++;
   }

   //Task 4: write another function called increment that will add one to the all of the elements in an array
   //parameter: int[] (int array)
   //return: nothing
   public static void increment(int[] a){
      for(int i=0;i<a.length;i++){
         a[i]++;
      } 
   }
  
   /*Task 5: Write a method (above) called modify that will take a value and the indexed position 
   for where to put that value and replace it in the list. For example if the list is 
   {1,12,31,24,15,62,73,87,90} the following calls will change the list as noted:
modify(list, 555, 0)  --> now the list is {555,12,31,24,15,62,73,87,90} 
modify(list, 99,3)  --> now the list is {555,12,31,99,15,62,73,87,90} 
modify(list, 50,20) --> shouldn't crash the program, but shouldn't change the list either.

DO NOT RETURN the array. In other words, make this method void. The header should look like this:
  ***When you print the array before and after the call to modify (in main) does it change?
 */
   public static void modify(int[] a, int val, int i){
   a[i] = val;
   }
 
 /* Task 6- Write a method called smallest (above)that will find and return the smallest value 
 of the list. It should return an integer and take the integer array as input (an argument).*/
   public static int smallest(int[] a){
      int small = a[0];
      for(int n:a){
         if(n < small) small = n;
       }
      return small;
   }

/*Task 7 -  Write a method called moreThan1 (above) that will determine if there is more than one of 
the same value in a given array. If there is, return true, if not return false.  
For example sending the array {1,2,3,4,5,6,7,8,9} will return false, but {1,2,2,3,4,5,6,7,8,9} 
will return true. NOTE: THE ARRAY IS NOT NECESSARILY ORDERED (remember the array is random numbers 
from 1-13)!  
*/
   public static boolean moreThan1(int[] a){
      for(int out=0; out<a.length-1; out++){//length is the number of numbers in the array
         for(int rest=out+1; rest<a.length; rest++){
            if(a[out]==a[rest]) return true;
         }
      }
      return false;
   }

/* Task 8 - Write a method called search (above) that will take an integer value and a list. 
It will look for the value in the list and return the index of the LOCATION where it finds that value.
If the integer value is not found it will return -1. For example, if the list is 
{1,12,31,24,15,62,73,87,90} then the following values will be returned:
search(list, 12) --> 1
search(list, 87) --> 7
search(list, 1) --> 0
search(list, 29) --> -1
*/
   
/* Task 9. Write a method called swap (above) that will take an integer array and 2 indexed positions and swap the values in those positions. For example, if the integer array is {1,12,31,24,15,62,73,87,90} , the calls listed below will make the following changes:
swap(list, 1, 4) --> now the list will be: {1,15,31,24,12,62,73,87,90} 
swap(list, 0,8) --> now the list will be: {90,15,31,24,12,62,73,87,1}
Test it here in main: "
*/

 


 
  
//**********************************************MAIN*************************************************
  public static void main(String[] args){
 //create an int array with 8 elements
 int[] nums = new int[8];

  //Task 1 call on your fillArray function here: 
  fillArray(nums);

  // Task 2: Create a stringFormat function that takes an int array and formats
  // the elements into a String (see method header above). Test it here:
  System.out.println(stringFormat(nums));
  

  // Task 3: Create a function called increment (defined above). send it an integer number. What happens to that variable here in main?
  int mainInt = nums[0]; //note: what is the value of nums[0]?
  System.out.println("In main the value is " + mainInt);
  increment(mainInt);
  System.out.println("After a call to increment the value is "+mainInt);

  //Task 4: Create another function called increment (overloaded!) this time you will send the integer array as an argument. Do the same thing as above. 
  System.out.println("The array before calling increment: " + stringFormat(nums));
  increment(nums);
  System.out.println("The array after calling increment: "+stringFormat(nums));
  
  
  /*Task 5: Write a method (above) called modify that will take a value and the indexed position for where to put that value and replace it in the list. For example if the list is {1,12,31,24,15,62,73,87,90} the following calls will change the list as noted:
Test it here in main. For example print the original array, modify it, then print it again (just like we did above)
  */
   modify(nums, 555, 0);
   System.out.println(stringFormat(nums));
   modify(nums, 99, 3);
   System.out.println(stringFormat(nums));
   //modify(nums, 50, 20);
   //System.out.println(stringFormat(nums));


/* Task 6: Write a method called smallest (above)that will find and return the smallest value of
the list. It should return an integer and take the integer array as input (an argument).
Test it here in main
*/
   System.out.println("The smallest number is: "+(smallest(nums)));

/*Task 7: Write a method called moreThan1 (above) that will determine if there is more than one of 
the same value in a given array. If there is, return true, if not return false.  
For example sending the array {1,2,3,4,5,6,7,8,9} will return false, but {1,2,2,3,4,5,6,7,8,9} 
will return true. NOTE: THE ARRAY IS NOT NECESSARILY ORDERED (remember the array is random numbers 
from 1-13)!  
Test it here in main
*/ 
   if(moreThan1(nums)== true) System.out.println("There are doubles");
   else System.out.println("There are no doubles");

/* Task 8: Write a method called search (above) that will take an integer value and a list. It will look for the value in the list and return the index of the LOCATION where it finds that value.If the integer value is not found it will return -1. For example, if the list is {1,12,31,24,15,62,73,87,90} then the following values will be returned:
Test it here in main
*/

/* Task 9: Write a method called swap (above) that will take an integer array and 2 indexed positions and swap the values in those positions. For example, if the integer array is {1,12,31,24,15,62,73,87,90} , the calls listed below will make the following changes:
Test it here in main: 
*/
  }

}
