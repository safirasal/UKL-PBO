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
public class Masyarakat extends Person {

    private int idMasyarakat;

    public Masyarakat(int idMasyarakat, String nama, String alamat, String telepon) {
        super(nama, alamat, telepon);
        this.idMasyarakat = idMasyarakat;
    }

    public int getIdMasyarakat() {
        return idMasyarakat;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getTelepon() {
        return telepon;
    }
    }
  
    
    

