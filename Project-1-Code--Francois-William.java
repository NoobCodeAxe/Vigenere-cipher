/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1.code.francois.first;


import java.util.Scanner;

/**
 *
 * @author William Francois
 * ID: U0000001232
 */
public class Project1CodeFrancoisFirst {

    /**
     * @param args the command line arguments
     */
    
 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String plainText = "";
        String key = "FRANCOIS";                              //key
        String alpha ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encryptedText = ""; 
        char eKey[] = key.toCharArray();
        char alphabet[] = alpha.toCharArray();
        
        
        System.out.print("Please enter the text to be encrypted?\n");
        plainText = scan.nextLine();                                  //get text from user
        plainText.toUpperCase();                                       // make all text capitalized
        
        char text[] = plainText.toCharArray();
        
        
        int keyLocate;
        int locate;
        int keyIndex = 0;
        for (int i = 0; i < text.length;i++){                           // encrypt character
            if (keyIndex > 7){                                             // increment key index
                keyIndex = 0;
            }
         
            if(Character.isLetter(text[i]) == true){                        // if it is a letter encrypt otherwise just pass through. Used to catch spaces and punctuation
               locate = alpha.indexOf(text[i]);                              //find it in the alphabet
               keyLocate = alpha.indexOf(eKey[keyIndex]);                       //find key letter in alphabet
               encryptedText += alphabet[(keyLocate + locate)%26];              // add them, mod 26, and return the character at the new index
               keyIndex++;
            }else{
                encryptedText += text[i];
            }
            
           
        }
        
        System.out.print("\n" + encryptedText);
    }
    
}
