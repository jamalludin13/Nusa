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
import NusaSort.db;
import NusaSort.Nasabah;
import NusaSort.NasabahBubble;


public class Sorting {
    public static void main(String[]args){
        NasabahBubble ns = new NasabahBubble();
        ArrayList<Nasabah> bubbleSort = new ArrayList<Nasabah>();
        ArrayList<Nasabah> insertSort = new ArrayList<Nasabah>();
        ArrayList<Nasabah> selectionSort = new ArrayList<Nasabah>();
        ArrayList<Nasabah> reversed = new ArrayList<Nasabah>();
        ArrayList<Nasabah> mergeSort = new ArrayList<Nasabah>();
    
        
        System.out.println("-----------------------------------------------");
    
        System.out.println("Bubblesort");
        System.out.println("+ID\t|\tNAME\t\t|\tNIK\t\t|\tUSERNAME\t\t");
        
        bubbleSort = ns.doBubbleSort(ns.getDbList(), "username");
        
        for (int i=0;i<bubbleSort.size();i++){
            System.out.println("+"+bubbleSort.get(i).getId()
                    +"\t|"+bubbleSort.get(i).getNama()
                    +"\t\t\t|"+bubbleSort.get(i).getNik()
                    +"\t\t|"+bubbleSort.get(i).getUsername());
        }
        
        System.out.println("Insertion");
        System.out.println("+ID\t|\tNAME\t\t|\tNIK\t\t|\tUSERNAME\t\t");
        
        insertSort = ns.doInsertionSort(ns.getDbList(), "name");
        
        for (int i=0;i<insertSort.size();i++){
           System.out.println("+"+insertSort.get(i).getId()
                    +"\t|"+insertSort.get(i).getNama()
                    +"\t\t\t|"+insertSort.get(i).getNik()
                    +"\t\t|"+insertSort.get(i).getUsername());
        }
        
        System.out.println("Selection");
        System.out.println("+ID\t|\tNAME\t\t|\tNIK\t\t|\tUSERNAME\t\t");
        
        selectionSort = ns.doSelectionSort(ns.getDbList(), "nik");
        
        for (int i=0; i<selectionSort.size(); i++) {
            System.out.println("+"+insertSort.get(i).getId()
                    +"\t|"+selectionSort.get(i).getNama()
                    +"\t\t\t|"+selectionSort.get(i).getNik()
                    +"\t\t|"+selectionSort.get(i).getUsername());
        }
        
        System.out.println("MergeSort");
        System.out.println("+ID\t|\tNAME\t\t|\tNIK\t\t|\tUSERNAME\t\t");
        
        mergeSort = ns.doMergeSort(ns.getDbList());
        
        for (int i=0; i<selectionSort.size(); i++) {
            System.out.println("+"+mergeSort.get(i).getId()
                    +"\t|"+mergeSort.get(i).getNama()
                    +"\t\t\t|"+mergeSort.get(i).getNik()
                    +"\t\t|"+mergeSort.get(i).getUsername());
        }
        
        System.out.println("Descending");
        System.out.println("+ID\t|\tNAME\t\t");
        reversed = ns.doReverse();
        for (int i=0; i<selectionSort.size(); i++) {
            System.out.println("+"+reversed.get(i).getId()
                    +"\t|"+reversed.get(i).getNama()
                    +"\t\t\t|"+reversed.get(i).getNik()
                    +"\t\t|"+reversed.get(i).getUsername());
        }
        System.out.println("-----------------------------------------------");
    }
}
