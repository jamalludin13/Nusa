/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType;

import java.util.Scanner;

/**
 *
 * @author Jamalludin
 */
public class Exercise2 {
       public static void main (String[]args){
        
        double inc;
        double meter;  
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai inc = ");
        inc = input.nextDouble();
 
        meter = inc/100;
        System.out.println("Inc to Meter "+meter);
    }
}

