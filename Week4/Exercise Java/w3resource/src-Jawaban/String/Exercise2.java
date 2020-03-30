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
public class Exercise2 {
     
   public static void main(String[] args) {
  
    String ab = "w3resource.com";
    System.out.println("Original String : " + ab);
   
    int val1 = ab.codePointAt(1);
     int val2 = ab.codePointAt(9);
        
     System.out.println("Character(unicode point) = " + val1);
     System.out.println("Character(unicode point) = " + val2);
  }
}
 
