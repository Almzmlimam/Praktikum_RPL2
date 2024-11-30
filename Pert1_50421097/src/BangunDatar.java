/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Al Muzammil Imam
 */

public class BangunDatar {
    
    // Method untuk menghitung keliling dan luas persegi
    public static void persegi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi: ");
        double sisi = input.nextDouble();
        
        double keliling = 4 * sisi;
        double luas = sisi * sisi;
        
        System.out.println("Keliling persegi: " + keliling);
        System.out.println("Luas persegi: " + luas);
    }
    
    // Method untuk menghitung keliling dan luas persegi panjang
    public static void persegiPanjang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();
        
        double keliling = 2 * (panjang + lebar);
        double luas = panjang * lebar;
        
        System.out.println("Keliling persegi panjang: " + keliling);
        System.out.println("Luas persegi panjang: " + luas);
    }
    
    // Method untuk menghitung keliling dan luas lingkaran
    public static void lingkaran() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();
        
        double keliling = 2 * Math.PI * jariJari;
        double luas = Math.PI * jariJari * jariJari;
        
        System.out.println("Keliling lingkaran: " + keliling);
        System.out.println("Luas lingkaran: " + luas);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = input.nextInt();
        
        switch(pilihan) {
            case 1:
                persegi();
                break;
            case 2:
                persegiPanjang();
                break;
            case 3:
                lingkaran();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}