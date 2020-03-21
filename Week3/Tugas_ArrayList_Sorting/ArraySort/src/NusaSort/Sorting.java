/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NusaSort;

/**
 *
 * @author Jamalludin
 */
import java.util.ArrayList;

public class Sorting {

	public void bubbleSort(ArrayList<Integer> items) {
		for(int i=items.size();i>=1;i--) { 
			for(int j=0;j<i-1;j++) { 
				if(items.get(j)>items.get(j+1)) {
					int temp=items.get(j);
					items.set(j, items.get(j+1));
					items.set(j+1, temp);
				}
			}
		}
		System.out.println("Sorted List:");
		System.out.println(items);
	}
	
}
