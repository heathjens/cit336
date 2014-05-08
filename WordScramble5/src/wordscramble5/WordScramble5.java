/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble5;

import java.io.Serializable;
import java.util.Scanner;

public class WordScramble5 implements Serializable {
    
    //Instance Variables
    String name;
    String instructions= "Word Scramble\n"
            +"Number of players: one\n" 
    +"Players pick how many letters they want to have in their game word \n"
	+"and the system picks a word from an internal list and randomizes the letters.  The player has 3 chances\n"
	+"to guess the right word.\n" 
	+"Goal: Guess the right word in three chances.\n" 
	+"Game Rules:\n"
	+"1. Can only select from a predetermined number of letter limits (3, 4, 5, 6)\n"
	+"2. Can only enter one guess per try. \n";
	
    public static void main(String[] args) {
        WordScramble5 myGame = new WordScramble5();
        myGame.getName();
        myGame.displayHelp();
        // TODO code application logic here
    }
       
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
    }
    
    public void displayHelp(){
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
      
    public WordScramble5() {
    }
  
 
}

