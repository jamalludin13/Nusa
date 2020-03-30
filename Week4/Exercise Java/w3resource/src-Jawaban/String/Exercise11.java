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
public class Exercise11 {
      public static void main(String[] args)
    {
       
        char[] arr_num = new char[] { '1', '2', '3', '4' };
        String input = String.copyValueOf(arr_num, 1, 3);

        System.out.println("\nThe book contains " + input +" pages.\n");
    }
}

