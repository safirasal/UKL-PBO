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
public class Petugas extends Person {
   /** class Petugas hanya menambahkan attribut idPetugas dan jabatan
     untuk nama, alamat, dan telepon mewariskan dari claas Person */
    private int idPetugas;

    public Petugas(int idPetugas, String nama, String alamat, String telepon) {
        super(nama, alamat, telepon); /** pemanggilan constructor Person */
        this.idPetugas = idPetugas;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idPetugas" */
    public int getIdPetugas() {
        return idPetugas;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "nama" */
    public String getNama() {
        return nama;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "alamat" */
    public String getAlamat() {
        return alamat;
    }
    
    /** implementasi enkapsulasi dengan pembuatan method utk mengakses data private "telepon" */
    public String getTelepon() {
        return telepon;
    }
}
