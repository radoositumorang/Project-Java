/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectbangundatar;

/**
 *
 * @author asus
 */
public class Persegipanjang {
      int panjang,lebar;
       
       void hitungLuas(){
            int luas = this.panjang * this.lebar;
            System.out.println("hasilnya : " + luas);
        }
       
       void hitungKeliling(){
            int keliling = this.panjang * 2 + this.lebar * 2;
            System.out.println("hasilnya : " + keliling);
        }
       
       public static void main(String[] args) {
           Persegipanjang pp1 = new Persegipanjang();
           pp1.panjang = 10;
           pp1.lebar = 7;
           pp1.hitungKeliling();
           pp1.hitungLuas();
           
           Persegipanjang pp2 = new Persegipanjang();
           pp2.panjang = 14;
           pp2.lebar = 9;
           pp2.hitungKeliling();
           pp2.hitungLuas();
    }
}
