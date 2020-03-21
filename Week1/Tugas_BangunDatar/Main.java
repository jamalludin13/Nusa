/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Jamalludin
 */
public class Main {
public static void main(String[] args) {
        
        BangunDatar bangunDatar = new BangunDatar();
        Persegi persegi = new Persegi(6);
        Segitiga segitiga = new Segitiga(8, 12);
        Lingkaran lingkaran = new Lingkaran(70);
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("keliling persegi: " + persegi.keliling());
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Luas lingkaran: " + lingkaran.luas());
        System.out.println("keliling lingkaran: " + lingkaran.keliling());
    }
    
}
