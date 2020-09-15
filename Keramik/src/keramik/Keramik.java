/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramik;

/**
 *
 * @author ACER
 */
public class Keramik {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProjectKeramik p1 = new ProjectKeramik();
        p1.panjang = 30;
        p1.lebar = 30;
        p1.harga = 54000;
        p1.isi = 10;
        p1.name = 1;
        p1.hitung();
       
        
        ProjectKeramik p2 = new ProjectKeramik();
        p2.panjang = 40;
        p2.lebar = 40;
        p2.harga = 65000;
        p2.isi = 5;
        p2.name = 2;
        p2.hitung();
        
        ProjectKeramik p3 = new ProjectKeramik();
        p3.panjang = 30;
        p3.lebar = 40;
        p3.harga = 60000;
        p3.isi = 8;
        p3.name= 3;
        p3.hitung();
  
        
    }

   
}
