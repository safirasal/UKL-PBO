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
public class ListMasyarakat {
    Masyarakat[] list = {
        new Masyarakat(1, "Siska", "Banten", "1234"),
        new Masyarakat(2, "Rafli", "Bekasi", "5672"),
        new Masyarakat(3, "Marti", "Padang", "9089"),
    };

public void viewListMasyarakat(){
        System.out.println("--- List Petugas ---");
        System.out.println("ID \t Nama \t Alamat");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getIdMasyarakat()+" \t "
            + list[i].getNama()+ " \t "
            + list[i].getAlamat());
        }
    }
public int cariMasyarakat(int id){
        int foundIndex = 0;
        for (int i = 0; i < list.length; i++) {
            
            if(list[i].getIdMasyarakat()== id){
                foundIndex = i;
            }
        }
        return foundIndex;
    }
}

