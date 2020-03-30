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
public class Exercise3 {
    public static void main(String [] args){
    int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;
    
    for(int i=0; i < number.length ; i++)
        sum = sum + number [i];
        double average = sum / number.length;
        System.out.println("Average of array is : " + average); 
     
}
}

