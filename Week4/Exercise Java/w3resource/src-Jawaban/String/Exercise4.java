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
public class Exercise4 {
    
 public static void main(String[] args) {
  
    String input  = "w3rsource.com";
    System.out.println("Original String : " + input);
    
    int data = input.codePointCount(1, 10); 
    System.out.println("Codepoint count = " + data);
  }
}

