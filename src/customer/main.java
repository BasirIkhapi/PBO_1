///*
// *Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package costumer;
//
///**
// *
// * @author ASUS
// */
//
//import databas_connection.databas_connection;
//import model.Customer;
//import model.Rating;
//


package customer;
import java.util.ArrayList;import java.util.List;
import java.util.Scanner;import CRUD.database;
/**
 * * @author ASUS
 */
public class main {    public static void main(String [] args){
        database dbConnect = new database();        
//        dbConnect.simpanCustomer(2, "yusril", "Yusril Maulana", "ysrl@gmail.com", "kurau", "foto", "083150058111", "syrl", "lajang");  
//        dbConnect.ubahCustomer(1, " basir099", "Basir Ikhapi", "basir@gmail.com", "Teluk Tanjung", "foto", "083150058888", "basirikhapiii", "lajang");   
//        dbConnect.simpanCustomer(1, "", "", "", "", "", "", "", "");  
          dbConnect.cariCustomer(2);
          dbConnect.showCustomer();
//        
//        dbConnect.simpanGallery(2, "image2.jpg", 102);
//        dbConnect.ubahGallery(1, "image2.jpg", 102);
//        dbConnect.hapusGallery(1);
          dbConnect.cariGallery(1);
          dbConnect.showGallery();
//
//        dbConnect.simpanRating(2, 102, 202, 302, 4, " Very good service!!");
//        dbConnect.ubahRating(1, 102, 202, 302, 4, "Very good service!");
//        dbConnect.hapusRating(1);
          dbConnect.cariRating(1);
          dbConnect.showRating();
//        
//        dbConnect.simpanJenisTukang(2, "Plumber");
//        dbConnect.ubahJenisTukang(1, "Plumber");
//        dbConnect.hapusJenisTukang(1);
          dbConnect.cariJenisTukang(1);
          dbConnect.showJenisTukang();
    }
}

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class main {
//    public static void main(String[] args) {
//        Connection connection = databas_connection.getConnection();
//
//        if (connection != null) {
//            // Contoh insert data Customer
//            costumer customer = new costumer(1, "Budi", "Jl. Merdeka No. 10", 5);
//            insertcostumer(connection, costumer);
//
//            // Contoh insert data Rating
//            rating rating = new rating(1, 1, 1, 5, "Sangat memuaskan");
//            insertRating(connection, rating);
//
//            // Contoh select data Customer
//            selectCustomer(connection);
//
//            // Contoh select data Rating
//            selectRating(connection);
//        }
//    }
//
//    public static void insertCustomer(Connection connection, costumer customer) {
//        String query = "INSERT INTO customer (id_customer, nama_customer, alamat_customer, jumlah) VALUES (?, ?, ?, ?)";
//        try {
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setInt(1, customer.getIdCustomer());
//            statement.setString(2, customer.getNamaCustomer());
//            statement.setString(3, customer.getAlamatCustomer());
//            statement.setInt(4, customer.getJumlah());
//            statement.executeUpdate();
//            System.out.println("Data customer berhasil ditambahkan.");
//        } catch (SQLException e) {
//            System.out.println("Gagal menambahkan data customer: " + e.getMessage());
//        }
//    }
//
//    public static void insertRating(Connection connection, rating rating) {
//        String query = "INSERT INTO rating (id_tukang, pesanan_id, id_customer, rating, ulasan) VALUES (?, ?, ?, ?, ?)";
//        try {
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setInt(1, rating.getIdTukang());
//            statement.setInt(2, rating.getPesananId());
//            statement.setInt(3, rating.getIdCustomer());
//            statement.setInt(4, rating.getRating());
//            statement.setString(5, rating.getUlasan());
//            statement.executeUpdate();
//            System.out.println("Data rating berhasil ditambahkan.");
//        } catch (SQLException e) {
//            System.out.println("Gagal menambahkan data rating: " + e.getMessage());
//        }
//    }
//
//    public static void selectCustomer(Connection connection) {
//        String query = "SELECT * FROM customer";
//        try {
//            PreparedStatement statement = connection.prepareStatement(query);
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id_customer");
//                String nama = resultSet.getString("nama_customer");
//                String alamat = resultSet.getString("alamat_customer");
//                int jumlah = resultSet.getInt("jumlah");
//                System.out.println("ID: " + id + ", Nama: " + nama + ", Alamat: " + alamat + ", Jumlah: " + jumlah);
//            }
//        } catch (SQLException e) {
//            System.out.println("Gagal mengambil data customer: " + e.getMessage());
//        }
//    }
//
//    public static void selectRating(Connection connection) {
//        String query = "SELECT * FROM rating";
//        try {
//            PreparedStatement statement = connection.prepareStatement(query);
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                int idTukang = resultSet.getInt("id_tukang");
//                int pesananId = resultSet.getInt("pesanan_id");
//                int idCustomer = resultSet.getInt("id_customer");
//                int rating = resultSet.getInt("rating");
//                String ulasan = resultSet.getString("ulasan");
//                System.out.println("ID Tukang: " + idTukang + ", Pesanan ID: " + pesananId + ", ID Customer: " + idCustomer + ", Rating: " + rating + ", Ulasan: " + ulasan);
//            }
//        } catch (SQLException e) {
//            System.out.println("Gagal mengambil data rating: " + e.getMessage());
//        }
//    }
//}
//
//    
//
