/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author ONE
 */
public class Kalkulator {
    static float total = 0, bill = 1, bil = 1; //global
    
    public static void main(String[] args) {
        scanner input = new scnner (System.in);
        
        while(bill1 ! = 0 & bill2! = 0);
       Sytem.out.println("Kalkulator Sederhana");
       System.out.println("1. Penjumlahan");
       System.out.println("2. Pengurangan");
       System.out.println("3. Perkalian");
       System.out.println("4. Pembagian");
       System.out.print("Masukkan Pilihan Anda");
        Int pilihan = input.nexInt();
        
           System.out.print("Masukkan Bilangan ke-1 =");
           bill = input.nextFloat();
           System.out.print("Masukkan Bilangan ke-2 =");
           bill = input.nextFloat();
           
           switch(pilihan){
               
               case 1 :
                   System.out.println(+ bil1 + "+" + bil2);          
                   System.out.print("Hasilnya =");
                   total = bil1 + bil2;
                   break;
                   
               case 2 : 
                   System.out.println(+ bil1 + "-" + bil2);
                   System.out.print("Hasilnya =");
                   total = bil1 - bil2;
                   break;
                   
               case 3 :
                    System.out.println(+ bil1 + "*" + bil2);      
                   System.out.print("Hasilnya =");
                   total = bil1 * bil2;
                   break;
                   
               case 4 :
                    System.out.println(+ bil1 + "/" + bil2);    
                   System.out.print("Hasilnya =");
                   total = bil1 / bil2;
                   break;
               default:
                   
                   System.out.println("Anda harus mengisi angka");
           }
           System.out.println(total);
           
                   
                   
                   
                   
                 
           }
    }
}