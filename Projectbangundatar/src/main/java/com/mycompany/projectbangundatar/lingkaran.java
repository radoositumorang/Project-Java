/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectbangundatar;

/**
 *
 * @author asus
 */
public class lingkaran {
      double luas, phi=3.14 , keliling ;
       int r;
       void hitungLuas(){
            luas = phi*r*r;
            System.out.println("hasilnya : " + luas);
        }
       
       void hitungKeliling(){
            keliling = 2*phi*r;
            System.out.println("hasilnya : " + keliling);
        
        }
       
       
       public static void main(String[] args) {
           lingkaran pp1 = new lingkaran();
           pp1.r = 10;
           pp1.hitungLuas();
           pp1.hitungKeliling();
           
           
    }
}
