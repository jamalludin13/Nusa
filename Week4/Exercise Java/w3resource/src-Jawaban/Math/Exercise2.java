/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math;

/**
 *
 * @author Jamalludin
 */
 
import java.util.*;
 
public class Exercise2 {
  public static void main(String[] args) {
  
  double value = 12.56;
  double fractional_part = value % 1;
  double integral_part = value - fractional_part;  
  
  System.out.print("\nOriginal value: "+value);
  System.out.print("\nIntegral part: "+integral_part);
  System.out.print("\nFractional part: "+fractional_part);
  System.out.println();  
  }
}