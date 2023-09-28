package task1;

import java.io.*;
import java.util.*;
public class CountString
{
public static void main(String[] args)throws IOException
{

	Scanner input=new Scanner(System.in);
	System.out.println("Enter full file path of file");
	String filename=input.next();
 	File file = new File(filename);
	try {
   	 
	 System.out.println(" enter your choice");
	 System.out.println("Press 1 : content to be printed.");
	 System.out.println("Press 2 : word occurancerance ");
	 int choice=input.nextInt();
	 String s=null; 
	 switch(choice)
	 {
	     case 1: //Print the file content
		  {
			 Scanner scanner = new Scanner(file);//Get
			 System.out.println("Printing the file contnent:");
			 while (scanner.hasNext()) 
			 {
			 s=scanner.next();
			 System.out.print(s+" ");
			 } //while end
			 break;
		  }//Case1
	      case 2://Word Search
		  {
			 Scanner scanner = new Scanner(file);//get the content or read the file
			 System.out.print("Enter the word that need to be searched:");
			 String word=input.next();
			 int flag=0; 
			 		 
			 while (scanner.hasNext())  
			 {
			    
			    s=scanner.next();
			    if(s.equalsIgnoreCase(word))
			    {
			      
			      flag++; 
			    }
					 
		         } 
			 if(flag!=0)
			 {
			    System.out.println( word +"  is available in the file");
				System.out.println("'"+ word+"' have occurred "+ flag +" times in the file");
			    
			 }
			 else //if searched word is not available
			 {
			    System.out.println("The Word - '"+word+"' is not available in the file"); 
			 }
			    break;
		     }
               default:
		   {
		    System.out.println("You have entered incorrect option"); //Check for the option entered inappropriately 
		    break;
		   }
	    }
         }
	 catch(Exception e)
	 {
	      System.out.println(e.getMessage()); //Display the exception if any 
	 }
 }

}


