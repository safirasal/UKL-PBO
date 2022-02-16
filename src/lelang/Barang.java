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
public class Barang {
    private int idBarang;
    private String namaBarang;
    private double hargaAwal;
    private boolean status;
    
    public Barang (int idBarang, String namaBarang, double hargaAwal, boolean status ) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.hargaAwal = hargaAwal;
        this.status = status;
    }
    
    public int getIdBarang(){
        return idBarang;
    }
    public String getnamaBarang(){
        return namaBarang;
    }
    public double gethargaAwal(){
        return hargaAwal;
    }
    public void changeStatus(){
        this.status = !this.status;
    }
    public String getStatus() {
        if (status) {
            return "Barang bisa ditawar";
        }
        else{
            return "Maaf, barang tidak bisa ditawar";
        }
    }

    public boolean isStatus() {
        return status;
    }
        
}
    
