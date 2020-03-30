/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conditional;
import java.util.Scanner;

/**
 *
 * @author Jamalludin
 */
 public class Exercise1 {
 
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a Number: ");
       
        int angka = in.nextInt();

        if (angka > 0)
        {
            System.out.println("Number is positive");
        }
        else if (angka < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}