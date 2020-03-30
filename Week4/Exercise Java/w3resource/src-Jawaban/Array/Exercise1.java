/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;

/**
 *
 * @author Jamalludin
 */
public class Exercise1 {
public static void main(String[] args){   
    
    int[] number = {1, 2, 3, 5, 6, 8, 9, 7};
            
    String[] huruf = {"Buku", "Pulpen", "Penggaris", "Binder"};        
    System.out.println(" Number : "+Arrays.toString(number));
    Arrays.sort(number);
    System.out.println("Sorted Number : "+Arrays.toString(number));
    
    System.out.println("Huruf : "+Arrays.toString(huruf));
    Arrays.sort(huruf);
    System.out.println("Sorted Huruf : "+Arrays.toString(huruf));
    }
}

