/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NusaSort;
       
import java.util.ArrayList;
import java.util.Scanner;
public class NasabahBubble {

	public static void main(String[] args) {
		ArrayList <Integer> items = new ArrayList<>();
		Scanner inp = new Scanner(System.in);
		
		 System.out.println("Masukkan jumlah nasabah :");
		 int HowManyElements = inp.nextInt();
		 
		
		 System.out.println("Masukkan Rekening Nasabah :");
		for (int i = 1 ; i<= HowManyElements; i++){
			items.add(inp.nextInt());
		}
		inp.close();
		
		//Print out the Original ArrayList
		System.out.println("Unsorted List:");
		System.out.println(items);
		
		Sorting list=new Sorting();
		list.bubbleSort(items);
		}
	

}
