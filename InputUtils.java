/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inpututils;

import java.util.Scanner;

/**
 *
 * @author kheal
 */
public class InputUtils {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TASK 1: TO GET INPUT FROM KEYBOARD 
        // AND MAKE SURE IT IS TEXT ONLY
        //NO NUMBERS ALLOWED
        
        //IF INPUT IS NOT VALID - ASK THE USER TO TRY AGAIN / GIVE AN ERROR
        
        Scanner myKB = new Scanner(System.in);
        
        String userInput;
        
        do {
            System.out.println("Enter some text: ");
            System.out.println("You must enter text only!");
            
            userInput = myKB.nextLine();
            
        }while (!userInput.matches("[a-zA-Z!.?', ]+"));
        
        //the input must be text
        System.out.println(userInput);
        
         /* LEAVE SOME SPACE HERE */
        
        // TASK 2: To get input from the keyboard 
        //and make sure that it is NUMBERS ONLY
        // If not a number - ask again / give an error message
        // Output the result of doubling the number input
        
        do {
            System.out.println("Enter some integers: ");
            System.out.println("You must enter numbers only!");
            
            userInput = myKB.nextLine();
            
        }while (!userInput.matches("[0-9]+"));
        //must have a numeric input stored as a string
        
        int ans = Integer.parseInt(userInput);
        
        System.out.println("Double that is " + (ans*2));
        
        // TASK 3 - Ask the user to enter a number
        // UP TO A MAXIMUM (maxValue)
        // If the input is not valid then ask again / give an error 
   
        int maxValue = 20; // a max just for testing
    
        int userInput2= maxValue +1;
   
        do {
            System.out.println("Enter some numbers: ");
            System.out.println("You must enter numbers less than " + maxValue + " only!");
            
             try{
                    //this might go wrong if user enters text
                    userInput2 = myKB.nextInt();
            }
             catch (Exception e){
                System.out.println("That was not a number!");
                myKB.nextLine(); // this prevents infinite loop
            }
            
            //keep going while input too big
        }while ( userInput2 > maxValue);
    }
    
}
