import java.util.Scanner;//import Scanner class
public class digit{//class name

public static void main(String[] args){

   Scanner gk = new Scanner(System.in);//declare scanner
   System.out.print("Enter the 4 digit number: ");
   String number=gk.next()+gk.nextLine(); //input 4 digit number
   
   
   char num0 = number.charAt(0);
   char num1 = number.charAt(1);
   char num2 = number.charAt(2);
   char num3 = number.charAt(3);
                                 /*declare variables of char data type and use 
                                 String method char charAt(int index)*/
   System.out.println(num0);
   System.out.println(num1); //print variables
   System.out.println(num2);
   System.out.println(num3);
   
   int sum = Integer.parseInt(""+number.charAt(0))+Integer.parseInt(""+number.charAt(1))+Integer.parseInt(""+number.charAt(2))+Integer.parseInt(""+number.charAt(3));
            // use String method parseInt() and String concatenation to convert char to String to integer
   
   
   System.out.print(sum);// print sum
   
   
   
   } }
