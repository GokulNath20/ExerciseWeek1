import java.util.Scanner;//import Scanner class
public class Date{//class name

public static void main(String[] args){


 Scanner scan = new Scanner(System.in);//declare scanner
 
 System.out.print("Key in DD/MM/YY: ");// input DD/MM/YY
 String date = scan.nextLine();
 
 String change =date.replace('/','.');//use string method date.replace(char old,char new)
 
 System.out.println(change);// print variable change
 
 
 
 }}
 