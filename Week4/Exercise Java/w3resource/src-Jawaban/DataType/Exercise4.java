/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and odpen the template in the editor.
 */
package DataType;

import java.util.Scanner;

/**
 *
 * @author Jamalludin
 */
public class Exercise4 {
    public static void main (String[]args){
        
        int minute;
        int years;
        int days; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Minute = ");
        minute = input.nextInt();
 
       years = minute/262800;
        days = minute/720;
        System.out.println(minute + " is "+days + "days And "+years+"years");
    }
}    
 
