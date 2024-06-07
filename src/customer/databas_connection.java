///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package customer;
//
///**
// *
// * @author ASUS
// */
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class databas_connection{
//    private static final String URL = "jdbc:mysql://localhost:3306/jasatukangdb";
//    private static final String USER = "root";
//    private static final String PASSWORD = "";
//
//    public static Connection getConnection() {
//        Connection connection = null;
//        try {
//            connection = DriverManager.getConnection(URL, USER, PASSWORD);
//            System.out.println("Koneksi berhasil!");
//        } catch (SQLException e) {
//            System.out.println("Koneksi gagal: " + e.getMessage());
//        }
//        return connection;
//    }
//}
//
//    
//
