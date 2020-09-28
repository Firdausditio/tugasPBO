/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bejo2;

/**
 *
 * @author ACER
 */
public class ProjectBejo {
    int panjang,lebar,isi,harga;
    
    ProjectBejo (int p, int l, int s, int h) {
        panjang = p;
        lebar = l;
        isi = s;
        harga = h;
    }


    int totalKotakKeramik(){
        int total;
        int jmlhKeramik = 1000000;
        total = jmlhKeramik / (panjang * lebar);
        return total;
    }
    
    int totalKotak() {
        int total;
        int jmlhKeramik = 1000000;
        total = (jmlhKeramik / (panjang*lebar)) / isi;
        return total;
    }
    
    int hargaAkhir() {
        int total;
        int jmlhKeramik = 1000000;
        total = ((jmlhKeramik / (panjang * lebar)) / isi) * harga;
        return total;
    }
}
