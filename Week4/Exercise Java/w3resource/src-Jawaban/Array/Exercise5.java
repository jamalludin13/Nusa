/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Jamalludin
 */
public class Exercise5 {
    public static void main(String[] args) {   
        double average;
        int[] numbers = new int[]{10, 30, 20, 30, 40, 60, 100};
        int sum = 0;
        
       for(int i=0; i < numbers.length ; i++)
        sum = sum + numbers[i];
       
       average = sum / numbers.length;
       System.out.println("Average is : " + average); 
   }
 
}