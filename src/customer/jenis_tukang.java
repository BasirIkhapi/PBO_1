/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

/**
 *
 * @author ASUS
 */
public class jenis_tukang {
    private int idJenis;
    private String jenisTukang;

    public jenis_tukang(int idJenis, String jenisTukang) {
        this.idJenis = idJenis;
        this.jenisTukang = jenisTukang;
    }

    public int getIdJenis() {
        return idJenis;
    }

    public String getJenisTukang() {
        return jenisTukang;
    }
}
