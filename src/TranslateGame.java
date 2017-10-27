//Serhiy Bardysh
//Created a program to translate from English to Pig Latin
//This morning I have realized that even my program works but not 
//to Lab6 Specification.
// Need to do more work on it.
import java.util.Scanner;

public class TranslateGame {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println();
		Scanner scnr = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equals("y")) {
		System.out.println("Enter a line to be translated: ");
		
		String userInput = scnr.nextLine(); 
		
		StringBuffer ui = new StringBuffer(userInput);
				
		String Str = new String(userInput);
		
		for(int i=0; i < Str.length(); i++){
            if((Str.charAt(i) == 'a') || 
                (Str.charAt(i) == 'e') ||
                (Str.charAt(i) == 'i') || 
                (Str.charAt(i) == 'o') ||
                (Str.charAt(i) == 'u')) 
			
        System.out.println(ui.reverse().toString().toLowerCase().concat("way"));
            
		}
	    
		System.out.println("Do you want to translate another line? y/n");

		choice = scnr.nextLine();
		}	
		System.out.println("Good bye!!!");
		scnr.close();
		
	}

}
