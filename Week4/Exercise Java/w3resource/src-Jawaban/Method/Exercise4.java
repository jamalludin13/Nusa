/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

/**
 *
 * @author Jamalludin
 */
public class Exercise4 {
    
    public static void main(String[] args) {
        String str = "w3resource";
        int vcount = 0, ccount = 0;

        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) { char ch = str.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { vcount++; }
        else if((ch >= 'a'&& ch <= 'z')) {
                ccount++;
            }
        }
        System.out.println("Number of Vowels: " + vcount);
        
    }
}


