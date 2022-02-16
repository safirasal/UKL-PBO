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
public class ListPetugas {
    Petugas[] list = {
        new Petugas(1, "Rona", "Medan", "0341"),
        new Petugas(2, "Roni", "Depok", "0341"),
        new Petugas(3, "Riri", "Tuban", "0341"),
    };

public void viewListPetugas(){
        System.out.println("--- List Petugas ---");
        System.out.println("ID \t Nama \t Alamat");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdPetugas()+" \t "
            + list[i].getNama()+ " \t "
            + list[i].getAlamat());
        }
    }
public int cariPetugas(int id){
        int foundIndex = 0;
        for (int i = 0; i < list.length; i++) {
            
           
            if(list[i].getIdPetugas()== id){
                foundIndex = i; 
            }
        }
        return foundIndex;
    }
}


