/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

/**
 *
 * @author ASUS
 */
public class gallery {
    private int idFoto;
    private String image;
    private int tukangId;

    public gallery(int idFoto, String image, int tukangId) {
        this.idFoto = idFoto;
        this.image = image;
        this.tukangId = tukangId;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public String getImage() {
        return image;
    }

    public int getTukangId() {
        return tukangId;
    }
}

