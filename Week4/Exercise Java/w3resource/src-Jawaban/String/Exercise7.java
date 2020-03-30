/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author Jamalludin
 */
public class Exercise7 {
    
    public static void main(String[] args)
    {
        String input1 = "PHP Exercises and ";
        String input2 = "Python Exercises";
        
        System.out.println("String 1: " + input1);
        System.out.println("String 2: " + input2); 
       

        String input3 = input1.concat(input2);

        System.out.println("The concatenated string: " + input3);
    }
}
