/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang;

/**
 *
 * @author sfrsl
 */
public class ListBarang {
    Barang [] list = {
        new Barang (1, "Tas", 50000, true),
        new Barang (2, "Perhiasan", 700000, true),
        new Barang (3, "Sepatu", 10000, true),
    };
    
    public void viewListBarang(){
        System.out.println("--- List Masyarakat ---");
        System.out.println("ID \t Nama \t Alamat");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdBarang()+" \t "
            + list[i].getnamaBarang()+ " \t "
            + list[i].gethargaAwal()+ " \t "
            + list[i].getStatus() + " \t "  
            );
    }
    }
        public int cariMasyarakat(int id){
        int foundIndex = 0;
        /** pencarian data berdasarkan id */
        for (int i = 0; i < list.length; i++) {
            
            /** jika id yang dicari ditemukan */
            if(list[i].getIdBarang()== id){
                foundIndex = i; /** menyimpan nilai index dari data yg ditemukan */
            }
        }
        return foundIndex;
    }
}

