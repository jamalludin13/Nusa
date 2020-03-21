/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Jamalludin
 */
 public class balok extends Bangunruang {
    private int volumeb;
    public void Bangunruang(int panjang,int lebar,int tinggi){
        
        this.panjang=panjang;
        this.panjang=panjang;
        this.tinggi=tinggi;
        
        volumeb=panjang*lebar*tinggi;
        System.out.println("Menghitung Kerucut : "+volumeb);
    }
}   

