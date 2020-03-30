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

public class Exercise9 {
public static void main(String[] args) {
    String input1 = "example.com", input2 = "Example.com";
    CharSequence cs = "example.com";
    
     System.out.println("Comparing "+input1+" and "+cs+": " + input1.contentEquals(cs));
     System.out.println("Comparing "+input2+" and "+cs+": " + input2.contentEquals(cs));
          }
}