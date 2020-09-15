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
public class ProjectKeramik {
    int panjang,lebar,harga,isi,name;
    int luas = 1000000;
    float totalKeramik, hasilBox, hasilAkhir;

    void hitung() {
        int luasKeramik = 1000000;
        float totalKeramik;
        totalKeramik = luasKeramik/(panjang*lebar);
        if (totalKeramik - Math.round(totalKeramik) !=0){
            totalKeramik = (int) Math.round(totalKeramik) + 1;
        }
        float hasilBox;
        hasilBox = totalKeramik / isi;
        if (hasilBox - Math.round(hasilBox) !=0) {
            hasilBox = 1 + (int) Math.round(hasilBox);
        }
        float hasilAkhir;
        hasilAkhir = hasilBox * harga;
        System.out.println("Harga total Keramik " + name + ": Rp. " +(int) hasilAkhir + " rupiah dan berjumlah " + (int) hasilBox + "pcs Box");
       
    }

    
}
