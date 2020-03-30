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
public class Exercise19 {
    public static void main(String [] args){
        
        int a ;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Input a Decimal Number : ");
        a = input.nextInt();
        
        String Binary = Integer.toBinaryString(a); 
                System.out.println("Binary number is "+Binary);
        
    }
}
