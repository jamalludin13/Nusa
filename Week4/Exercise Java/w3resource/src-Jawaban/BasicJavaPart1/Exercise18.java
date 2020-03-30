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
public class Exercise18 {
    public static void main(String [] args){
        
        int a,b ;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Input the first binary number : ");
        a = input.nextInt();
        
        System.out.print("Input the second binary number : ");
        b = input.nextInt();
        
        
        String Binary = Integer.toBinaryString(a); 
         
                System.out.println("Product of two binary numbers" +Binary);
        
    }
}
