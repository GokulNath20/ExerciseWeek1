import java.util.Scanner;//import Scanner class
public class FunnyString{ // class name

public static void main(String[] args){


 Scanner funny = new Scanner(System.in);//declare scanner 
 
 System.out.print("colour:");
 String colour = funny.next()+funny.nextLine();//input colour
 
 System.out.print("food:");
 String food = funny.next()+funny.nextLine();//input food
 
 System.out.print("animal:");
 String animal = funny.next()+funny.nextLine();//input animal
 
 System.out.print("friend name:");
 String friend = funny.next()+funny.nextLine();//input friend name
 
 System.out.println("I had a dream that " +friend+ " ate a " + colour +" "+ animal+
                    " and said it tasted like " + food + "!");//print sentence
                    
                    }}

