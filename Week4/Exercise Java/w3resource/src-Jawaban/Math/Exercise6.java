/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math;


public class Exercise6 {
   public static void main(String[] args) {
	
       int num =1287;   
	int is_positive = 1;
        if (num < 0) {
            is_positive = -1;
            num = -1 * num;
        }
        int sum  = 0;
        while (num > 0) {
            int r = num % 10;
            
            int maxDiff = Integer.MAX_VALUE - sum * 10;
            if (sum > Integer.MAX_VALUE / 10 || r > maxDiff) 
				System.out.println("Wrong number");;
            
            sum = sum * 10 + r;
            num /= 10;
        }
        System.out.println(is_positive * sum);
   }
}