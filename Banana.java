/**
 * @param weight: double 
 * This code takes weight as an input
 * @version 1.0.1
 * @author Farida Eleshin
 * @Description :  a multi-way if-else statement that evaluates a person’s weight.  
 */
import java.util.Scanner;
public class Banana{
  
  //This is a main method to check the value of the weight and return the assigned string
  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    double weight = input.nextDouble();
    if ( weight <= 115) {
      System.out.println( "Eat 5 banana splits!");}
    else if ( weight <= 130){
      System.out.println( "Eat a banana split!");}
    else if ( weight <= 200){
      System.out.println( "Perfect!");}
    else{
      System.out.println( "  Plenty of banana splits have been consumed!");}

  }
}