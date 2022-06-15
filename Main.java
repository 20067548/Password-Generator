import java.util.*;
import java.io.*;
import java.math.*;

class Main 
{
  public static void main(String[] args) 
  {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the type of pasword you would like to generate" + "\n Types of passwords include...");
    System.out.println("1 - Lowercase letters." + "\n2- Uppercase letters," + "\n3 - Lowercase and uppercase letters." + "\n4 - Upper case, lowercase, and numbers." + "\n5 - Lowercase, uppercase, numbers, and symbols." + "\n0 - EXIT.");
    System.out.println("Enter selection by typing numbers 1, 2, 3, 4, 5, or 0 to exit.");
    int passwordType = scan.nextInt();
    
   /* System.out.println("Do you wish to continue? - Type 0 to exit or anything else to continue");   //Way to opt out.
    int optionX = scan.nextInt();
    if (optionX == 0)
    {
      System.out.println("Exiting program...");
      System.exit(0);   //This method exits and ends the program.
    }    */

    
   /*int[] upperInts = new int[1000];    //These are the arrays that you need. 
    int[] lowerInts = new int[1000];    //Nums based on the position in the ASCII character list.
    int[] mixedcaseInts = new int[1000];
    int[] mixedcaseWnums = new int[1000];
    int[] allCharacters = new int[1000]; */
    
    File uppercaseFile = new File("uppercaseFile.txt");   //Creating the five files.
    //Scanner inputFile1 = new Scanner(uppercaseFile).useDelimiter(",");
     PrintWriter inputFile1 = new PrintWriter(uppercaseFile);

     inputFile1.println("Mmmmm good soup.");

    inputFile1.close();


    /*
    File lowercaseFile = new File("LowercaseFile.txt");   //Figure out how to populate these files.
    File mixedcaseFile = new File("MixedcaseFile.txt");
    File mixedcaseWnumsFile = new File("MixedcaseWnums.txt");
    File allCharactersFile = new File("AllCharacters.txt"); */

  }
} 