/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner opsi = new Scanner(System.in);
        
        int celcius;
        int pilih;
        boolean menu=false;
        
        System.out.println("+--------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR|");
        System.out.println("+--------------------------+");
        System.out.println("Input Data");
        System.out.println("-----------");
        System.out.println("Suhu Dalam Celcius : ");
        celcius = input.nextInt();
        
        RumusSuhu rumus = new RumusSuhu (celcius);
          do{
            System.out.println("  ");
            System.out.println("Opsi");
            System.out.println("-----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Komversi");
            System.out.println("3. Exit");
            System.out.print("Pilihan : ");
            pilih = opsi.nextInt();
            switch (pilih) {
                    case 1 : 
                        rumus.cetak();
                    break;
                    
                    case 2 :
                        System.out.println(" ");
                        System.out.println("Input Data");
                        System.out.println("-----------");
                        input = new Scanner(System.in);
                        System.out.println("Suhu Dalam Celcius : ");
                        celcius = input.nextInt();
                        rumus = new RumusSuhu (celcius);
                    break; 
                    
                    case 3 :
                        menu=true;
                    break;
                    
                    default :
                        System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
                    break; 
                    
            }
          } while (!menu);
            
    }
}
