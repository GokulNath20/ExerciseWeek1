public class StringExercise//class name
{ 
  public static void main (String[] args) 
  { 
  String college = new String ("College of Arts and Sciences ");//declare string object
  String town = "UUM SINTOK"; // part (a)  //declare & initialize variable town 
  
  int stringLength; 
  String change1, change2, change3; // declare variables
  
  stringLength = college.length();// part (b) // use string method length()
  System.out.println (college + " contains " + stringLength + " characters."); 
  change1 =college.toUpperCase(); // part (c)   // use string method toUpperCase()
  System.out.println("The string is  all in upper case: " + change1);
  change2 =change1.replace('O','*'); //part (d) // use string method replace
  System.out.println ( "All capital O's are replaced with the asterisk character: " + change2); 
  change3 =college.concat(town); // part (e) //use string method concat(String town)
  System.out.println ("The final string is " + change3); //print variable change 3 
  } 
}  
