/*
 * To change this license heade, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaPart1;
import java.util.Scanner;
/**
 *
 * @author Jamalludin
 */
public class Kali {
    public static void main(String [] args){
        int a;
        int b;
        
        Scanner ka = new Scanner (System.in);
        System.out.print("Angka Pertama : ");
        a =ka.nextInt();
        
        System.out.print("Angka Kedua : ");
        b =ka.nextInt();
         
        int hasil = a * b;
        System.out.println(a * b+hasil);
    }
}
