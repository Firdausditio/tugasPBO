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
public class Bejo2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        ProjectBejo a = new ProjectBejo(30,30,10,54000);
        System.out.println("Total keramik A adalah " + a.totalKotakKeramik() + " keramik");
        System.out.println("Total Box keramik A adalah " + a.totalKotak() + " Box");
        System.out.println("Total Harga keramik A adalah Rp " + a.hargaAkhir() + " rupiah");
        System.out.println("--------------------------------------------------------------");
                
        ProjectBejo b = new ProjectBejo(40,40,5,65000);
        System.out.println("Total keramik B adalah " + b.totalKotakKeramik() + " keramik");
        System.out.println("Total Box keramik B adalah " + b.totalKotak() + " Box");
        System.out.println("Total Harga keramik B adalah Rp " + b.hargaAkhir() + " rupiah");
        System.out.println("--------------------------------------------------------------");
                
        ProjectBejo c = new ProjectBejo(30,40,8,60000);
        System.out.println("Total keramik C adalah " + c.totalKotakKeramik() + " keramik");
        System.out.println("Total Box keramik C adalah " + c.totalKotak() + " Box");
        System.out.println("Total Harga keramik C adalah Rp " + c.hargaAkhir() + " rupiah");
        System.out.println("--------------------------------------------------------------");
    }
    
}

