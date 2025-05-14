/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UASLingkaran;

/**
 *
 * @author Andri
 */
public class LingkaranBeraksi {
    public static void main(String[] args) {
        // Membuat objek lingkaran
        Lingkaran lingkaran = new Lingkaran();
        
        // Jari-jari yang dikasih
        double r = 11.78;
        
        // Menghitung luas dalam bentuk pecahan
        double luasPecahan = lingkaran.hitungLuas(r);
        
        // Menghitung luas dalam bentuk bulat
        int luasBulat = (int) luasPecahan;
        
        // Menghitung luas dengan pembulatan 
        long luasPembulatan = Math.round(luasPecahan);
        
        // Tampilin hasil
        System.out.println("Program Menghitung Luas Lingkaran");
        System.out.println("Jari-jari lingkaran: " + r);
        System.out.println("----------------------------------");
        System.out.println("Luas lingkaran (pecahan): " + luasPecahan);
        System.out.println("Luas lingkaran (bulat - type casting): " + luasBulat);
        System.out.println("Luas lingkaran (pembulatan): " + luasPembulatan);
    }
}
