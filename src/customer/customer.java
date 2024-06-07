/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

/**
 *
 * @author ASUS
 */
public class customer {
    private int idCustomer;
    private String username;
    private String nama;
    private String email;
    private String alamat;
    private String image;
    private String noTelp;
    private String password;
    private String status;

    public customer(int idCustomer, String username, String nama, String email, String alamat, String image, String noTelp, String password, String status) {
        this.idCustomer = idCustomer;
        this.username = username;
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
        this.image = image;
        this.noTelp = noTelp;
        this.password = password;
        this.status = status;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public String getUsername() {
        return username;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getImage() {
        return image;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getPassword() {
        return password;
    }

    public String getStatus() {
        return status;
    }
}
