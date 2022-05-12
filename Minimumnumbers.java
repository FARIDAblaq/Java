/**
 * @param a,b,c,d,e,f: int 
 * @version 1.0.1
 * @author Farida Eleshin
 * @Description :  Java program that prompts the user for a series of numbers
 * to determine the smallest value entered
 */
import java.util.Scanner;
import java.lang.Math;
public class Minimumnumbers{
  //This is a main method that prompts the user for a series of numbers
 //to determine the smallest value entered
  public static void main(String[] args){
    int a,b, c, d,e,f;
    System.out.println("ENTER THE FIRST NUMBER: ");
    Scanner word = new Scanner(System.in);
     a = word.nextInt();
     System.out.println("ENTER THE SECOND NUMBER: ");
     b = word.nextInt();
     System.out.println("ENTER THE THIRD NUMBER: ");
     c = word.nextInt();
     System.out.println("ENTER THE FOURTH NUMBER: ");
     d = word.nextInt();   
     e = Math.min(a,b);
     f = Math.min(c,d);
     System.out.println("THE MINIMUM NUMBER IS: ");
     System.out.println(Math.min(e,f));
     }
      }
    
  

  

    
    
    
  
    

  
  







 