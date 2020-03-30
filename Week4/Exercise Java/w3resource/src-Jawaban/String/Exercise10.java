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
public class Exercise10 {
    
public static void main(String[] args) {

    String input1 = "example.com", input2= "Example.com";
    StringBuffer strbuf = new StringBuffer(input1);
    
    System.out.println("Comparing "+input1+" and "+strbuf+": " + input1.contentEquals(strbuf));
    
    System.out.println("Comparing "+input2+" and "+strbuf+": " + input2.contentEquals(strbuf));
    
      }
}

