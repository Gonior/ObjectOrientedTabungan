/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan42.tabungan;

/**
 *
 * @author
 * NAMA         : Dedi Cahya
 * NIM          : 10118901
 * Kelas        : PBO11K
 * Deskripsi Program : Menghitung saldo tabungan dengan konsep orientasi objek
 */
public class Tabungan {
    private int saldo;

//    public int getSaldo() {
//        return saldo;
//    }
//
//    public void setSaldo(int saldo) {
//        this.saldo = saldo;
//    }
    
    public Tabungan(int saldo){
        this.saldo = saldo;
        System.out.println("Saldo anda Sekarang : " + saldo);
    } 
    
    public int ambilUang(int jumlah){
        jumlah = saldo - jumlah;
        return jumlah;
    }
}
