/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaPart1;

/**
 *
 * @author Jamalludin
 */
public class Swap15 {
    public static void main(String[] args) {
  
  int  a = 15;
   int b = 27;
   System.out.println("Before swapping : a, b = "+a+", "+ + b);
   a = a + b;
   b = a - b;
   a = a - b;
   System.out.println("After swapping : a, b = "+a+", "+ + b);
 }
 
}
