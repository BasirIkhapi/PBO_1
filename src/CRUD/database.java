/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.Statement;

/** 
 * 
 * @author YSRL 
 */ 
public class database { 
    private String databaseName = "basirikhapi_2210010341"; 
    private String username = "root"; 
    private String password = ""; 
    public static Connection connectionDB; 
     
    public database(){ 
        try { 
           String location = "jdbc:mysql://localhost/"+databaseName; 
           Class.forName("com.mysql.jdbc.Driver"); 
            
           connectionDB = DriverManager.getConnection(location, username, password);     
           System.out.println("Sistem Terkoneksi"); 
        } 
        catch (Exception e){ 
            System.out.println(e.getMessage()); 
        } 
    }
    public void simpanCustomer(int idCustomer, String username, String nama, String email, String alamat, String image, String noTelp, String password, String status){
    try{
        String sql = "insert into customer (id_costumer, username, nama, email, alamat, image, no_telp, password, status) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idCustomer);
        perintah.setString(2, username);
        perintah.setString(3, nama);
        perintah.setString(4, email);
        perintah.setString(5, alamat);
        perintah.setString(6, image);
        perintah.setString(7, noTelp);
        perintah.setString(8, password);
        perintah.setString(9, status);
        perintah.executeUpdate();
        System.out.println("Data Customer Berhasil Disimpan");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void ubahCustomer(int idCustomer, String username, String nama, String email, String alamat, String image, String noTelp, String password, String status){
    try{
        String sql = "update customer set username = ?, nama = ?, email = ?, alamat = ?, image = ?, no_telp = ?, password = ?, status = ? where id_costumer = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, username);
        perintah.setString(2, nama);
        perintah.setString(3, email);
        perintah.setString(4, alamat);
        perintah.setString(5, image);
        perintah.setString(6, noTelp);
        perintah.setString(7, password);
        perintah.setString(8, status);
        perintah.setInt(9, idCustomer);
        perintah.executeUpdate();
        System.out.println("Data Customer Berhasil Diubah");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void hapusCustomer(int idCustomer){
    try{
        String sql = "delete from customer where id_costumer = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idCustomer);
        perintah.executeUpdate();
        System.out.println("Data Customer Berhasil Dihapus");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void cariCustomer(int idCustomer) {
    try {
        String sql = "SELECT * FROM customer WHERE id_costumer = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idCustomer);
        ResultSet data = perintah.executeQuery();
        while (data.next()) {
            System.out.println("ID Customer : " + data.getString("id_costumer"));
            System.out.println("Username    : " + data.getString("username"));
            System.out.println("Nama        : " + data.getString("nama"));
            System.out.println("Email       : " + data.getString("email"));
            System.out.println("Alamat      : " + data.getString("alamat"));
            System.out.println("Image       : " + data.getString("image"));
            System.out.println("No Telp     : " + data.getString("no_telp"));
            System.out.println("Password    : " + data.getString("password"));
            System.out.println("Status      : " + data.getString("status"));
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
}

public void showCustomer() {
    try {
        Statement stmt = connectionDB.createStatement();
        ResultSet baris = stmt.executeQuery("SELECT * FROM customer ORDER BY id_costumer ASC");
        while (baris.next()) {
            System.out.println(baris.getString("id_costumer") + " | " +
                               baris.getString("username") + " | " +
                               baris.getString("nama") + " | " +
                               baris.getString("email") + " | " +
                               baris.getString("alamat") + " | " +
                               baris.getString("image") + " | " +
                               baris.getString("no_telp") + " | " +
                               baris.getString("password") + " | " +
                               baris.getString("status"));
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
}



public void simpanGallery(int idFoto, String image, int tukangId){
    try{
        String sql = "insert into gallery (id_foto, image, tukang_id) values(?,?,?)";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idFoto);
        perintah.setString(2, image);
        perintah.setInt(3, tukangId);
        perintah.executeUpdate();
        System.out.println("Data Gallery Berhasil Disimpan");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void ubahGallery(int idFoto, String image, int tukangId){
    try{
        String sql = "update gallery set image = ?, tukang_id = ? where id_foto = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, image);
        perintah.setInt(2, tukangId);
        perintah.setInt(3, idFoto);
        perintah.executeUpdate();
        System.out.println("Data Gallery Berhasil Diubah");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void hapusGallery(int idFoto){
    try{
        String sql = "delete from gallery where id_foto = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idFoto);
        perintah.executeUpdate();
        System.out.println("Data Gallery Berhasil Dihapus");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void cariGallery(int idFoto) {
    try {
        String sql = "SELECT * FROM gallery WHERE id_foto = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idFoto);
        ResultSet data = perintah.executeQuery();
        while (data.next()) {
            System.out.println("ID Foto  : " + data.getString("id_foto"));
            System.out.println("Image    : " + data.getString("image"));
            System.out.println("Tukang ID: " + data.getString("tukang_id"));
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
}

public void showGallery() {
    try {
        Statement stmt = connectionDB.createStatement();
        ResultSet baris = stmt.executeQuery("SELECT * FROM gallery ORDER BY id_foto ASC");
        while (baris.next()) {
            System.out.println(baris.getString("id_foto") + " | " +
                               baris.getString("image") + " | " +
                               baris.getString("tukang_id"));
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
}


public void simpanRating(int id, int idTukang, int pesananId, int idCostumer, int rating, String ulasan){
    try{
        String sql = "insert into rating (id, id_tukang, pesanan_id, id_costumer, rating, ulasan) values(?,?,?,?,?,?)";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, id);
        perintah.setInt(2, idTukang);
        perintah.setInt(3, pesananId);
        perintah.setInt(4, idCostumer);
        perintah.setInt(5, rating);
        perintah.setString(6, ulasan);
        perintah.executeUpdate();
        System.out.println("Data Rating Berhasil Disimpan");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void ubahRating(int id, int idTukang, int pesananId, int idCostumer, int rating, String ulasan){
    try{
        String sql = "update rating set id_tukang = ?, pesanan_id = ?, id_costumer = ?, rating = ?, ulasan = ? where id = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idTukang);
        perintah.setInt(2, pesananId);
        perintah.setInt(3, idCostumer);
        perintah.setInt(4, rating);
        perintah.setString(5, ulasan);
        perintah.setInt(6, id);
        perintah.executeUpdate();
        System.out.println("Data Rating Berhasil Diubah");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void hapusRating(int id){
    try{
        String sql = "delete from rating where id = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, id);
        perintah.executeUpdate();
        System.out.println("Data Rating Berhasil Dihapus");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void cariRating(int id) {
    try {
        String sql = "SELECT * FROM rating WHERE id = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, id);
        ResultSet data = perintah.executeQuery();
        while (data.next()) {
            System.out.println("ID         : " + data.getString("id"));
            System.out.println("ID Tukang  : " + data.getString("id_tukang"));
            System.out.println("Pesanan ID : " + data.getString("pesanan_id"));
            System.out.println("ID Customer: " + data.getString("id_costumer"));
            System.out.println("Rating     : " + data.getString("rating"));
            System.out.println("Ulasan     : " + data.getString("ulasan"));
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
}

public void showRating() {
    try {
        Statement stmt = connectionDB.createStatement();
        ResultSet baris = stmt.executeQuery("SELECT * FROM rating ORDER BY id ASC");
        while (baris.next()) {
            System.out.println(baris.getString("id") + " | " +
                               baris.getString("id_tukang") + " | " +
                               baris.getString("pesanan_id") + " | " +
                               baris.getString("id_costumer") + " | " +
                               baris.getString("rating") + " | " +
                               baris.getString("ulasan"));
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
}


public void simpanJenisTukang(int idJenis, String jenisTukang){
    try{
        String sql = "insert into jenis_tukang (id_jenisTukang, jenis_tukang) values(?,?)";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idJenis);
        perintah.setString(2, jenisTukang);
        perintah.executeUpdate();
        System.out.println("Data Jenis Tukang Berhasil Disimpan");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void ubahJenisTukang(int idJenis, String jenisTukang){
    try{
        String sql = "update jenis_tukang set jenis_tukang = ? where id_jenisTukang = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, jenisTukang);
        perintah.setInt(2, idJenis);
        perintah.executeUpdate();
        System.out.println("Data Jenis Tukang Berhasil Diubah");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

public void hapusJenisTukang(int idJenis){
    try{
        String sql = "delete from jenis_tukang where id_jenisTukang = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idJenis);
        perintah.executeUpdate();
        System.out.println("Data Jenis Tukang Berhasil Dihapus");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}


public void cariJenisTukang(int idJenis) {
    try {
        String sql = "SELECT * FROM jenis_tukang WHERE id_jenisTukang = ?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setInt(1, idJenis);
        ResultSet data = perintah.executeQuery();
        while (data.next()) {
            System.out.println("ID Jenis Tukang : " + data.getString("id_jenisTukang"));
            System.out.println("Jenis Tukang    : " + data.getString("jenis_tukang"));
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
}

public void showJenisTukang() {
    try {
        Statement stmt = connectionDB.createStatement();
        ResultSet baris = stmt.executeQuery("SELECT * FROM jenis_tukang ORDER BY id_jenisTukang ASC");
        while (baris.next()) {
            System.out.println(baris.getString("id_jenisTukang") + " | " +
                               baris.getString("jenis_tukang"));
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
}


}