/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaPart1;

import java.util.Scanner;
import static sun.util.calendar.CalendarUtils.mod;

/**
 *
 * @author Jamalludin
 */
public class MSum {
  public static void main(String [] args){
        int a  ;
        int b;
        
        Scanner ka = new Scanner (System.in);
        System.out.print("Angka Pertama : ");
        a =ka.nextInt();
        
        System.out.print("Angka Kedua : ");
        b =ka.nextInt();
         
        int hasil1 = a + b;
        int hasil2 = a - b;
        int hasil3 = a * b;
        int hasil4 = a / b;
        int hasil5 = a % b;
        
        System.out.println(hasil1);
        System.out.println(hasil2);
        System.out.println(hasil3);
        System.out.println(hasil4);
        System.out.println(hasil5);
        
    }
}
    

