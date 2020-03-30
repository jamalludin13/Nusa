/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaPart1;

import java.util.Scanner;

/**
 *
 * @author Jamalludin
 */
public class Exercise20 {
       public static void main(String [] args){
        
        int  desimal;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Input a Decimal number : ");
        desimal = input.nextInt();
         
        String hex = ""; 
        while (desimal != 0){
        int hexValue = desimal % 16; 
        
        char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
        (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
        hex = hexDigit + hex;
        desimal = desimal/16;
} 
         
                System.out.println("Hexadecimal number is " +hex);
        
    }
}
