/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

// *
// * @author Naufal Zaki
// *         TIFRP 19A
// *         19552011155
// *  Teknik Informatika
// ----------------------------------
// * SEKOLAH TINGGI TEKNOLOGI BANDUNG
// ----------------------------------
// */

import java.util.Scanner;

public class ProgramPembagian {

   
    public static void main(String[] args) {
        

        //Instansi objek input
        Scanner input = new Scanner(System.in);
        
 
        System.out.println("Masukan Angka bilangan : ");
        
        //mengambil nilai input user dan disimpan didalam var angkabilangan
        int angkabilangan = input.nextInt();
        
        System.out.println("Masukan bilangan pembagi : ");
        
        //Mengambil nilai input user dan disimpan didalam var angkapembagi
        int angkapembagi = input.nextInt();
        
        int hasil = angkabilangan/angkapembagi;
        int hasilbagi = angkabilangan%angkapembagi;
        
        System.out.println("Hasil Pembagian : " +hasil);
   
        if(hasilbagi==0) {
            hasilbagi = angkabilangan%angkapembagi;
            System.out.println("Hasil Sisa Pembagian :Tidak ada");
        }else{
            System.out.println("Hasil Sisa Pembagian : "+hasilbagi);
        }
    }
}


    

