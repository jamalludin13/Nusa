/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/**
 *
 * @author Jamalludin
 */
public class Exercise2 {
     public static void main(String [] args){
        
        int a,b,c;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Input the first number : ");
        a = input.nextInt();
        
        System.out.print("Input  the Second number : ");
        b = input.nextInt();
        
        System.out.print("Input he third number : ");
        c = input.nextInt();
      
        int average =  (a+b+c)/3;
        System.out.println("Average is  : " + average);
}
}
