/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan42.tabungan;
import java.util.*;
/**
 *
 * @author
 * NAMA         : Dedi Cahya
 * NIM          : 10118901
 * Kelas        : PBO11K
 * Deskripsi Program : Menghitung saldo tabungan dengan konsep orientasi objek
 */
public class PBO11K10118901Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Masukan Saldo Awal : ");
        int i = Scanner.nextInt();
        Tabungan t = new Tabungan(i);
        System.out.print("Jumlah uang yang diambil  : ");
        int ambil = Scanner.nextInt();
        System.out.println("Sisa Tabungan anda  : "+ t.ambilUang(ambil));
        
        
        
    }
    
}
