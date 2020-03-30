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
public class Exercise5 {
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number : ");
        int hari = input.nextInt();
        
        System.out.println(getDayName(hari));
        }


        public static String getDayName(int hari) {
        String dayName = "";
        switch (hari) {
            
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Invalid day range";
        }

        return dayName;
    }
}
    

