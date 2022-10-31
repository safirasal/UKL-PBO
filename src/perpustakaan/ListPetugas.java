/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author sfrsl
 */
public class ListPetugas {
    /** pemeberian nilai pada array "list" dengan tipe class Petugas */
    Petugas[] list = {
        new Petugas(1, "Bian", "Madiun", "0341"),
        new Petugas(2, "Dian", "Malang", "0341"),
        new Petugas(3, "Rani", "Bekasi", "0341"),
    };
    
    /** method untuk menampilkan data list petugas */
    public void viewListpetugas(){
        System.out.println("--- List Petugas ---");
        System.out.println("ID \t Nama \t Alamat \t Telepon");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdPetugas()+" \t "
            + list[i].getNama()+ " \t "
            + list[i].getAlamat() + " \t "
            + list[i].getTelepon());
        }
    }
    
    public int cariPetugas(int id){
        int foundIndex = 0;
        /** pencarian data berdasarkan id */
        for (int i = 0; i < list.length; i++) {
            
            /** jika id yang dicari ditemukan */
            if(list[i].getIdPetugas()== id){
                foundIndex = i; /** menyimpan nilai index dari data yg ditemukan */
            }
        }
        return foundIndex;
    }
}


