/*e
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataType;

/**
 *
 * @author Jamalludin
 */
import java.util.Scanner;

public class Exercise1{
    public static void main (String[]args){
        
        double fahrenheit;
        double celcius;  
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai Fahrenheit = ");
        fahrenheit = input.nextDouble();
 
        celcius = (int)((5.0 / 9) * (fahrenheit - 32) * 100) / 100.0; 
        System.out.println("Fahrenheit to Celcius "+celcius);
    }
}