/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan22perhitunganlingkaran;
import java.util.Scanner;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-1
 * NIM : 10118013
 * Deskripsi Program : Menghitung Jari-Jari, Luas, dan Keliling Lingkaran menggunakan Diameter
 */
public class IF110118013Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======Perhitungan Lingkaran======");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        Scanner scanner = new Scanner(System.in);
        double diameter = 0;
        while (!scanner.hasNextDouble()){
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.println("");
            System.out.print("Masukkan nilai diameter lingkaran : ");
            scanner.next();
        }
        diameter = scanner.nextDouble();
        System.out.println("");
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-jari Lingkaran = " + (diameter/2) + " cm");
        System.out.println("Luas Lingkaran = " + (3.14*(diameter/2)*(diameter/2)) + " cm");
        System.out.println("Keliling Lingkaran = " + (3.14*diameter) + " cm");
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}
