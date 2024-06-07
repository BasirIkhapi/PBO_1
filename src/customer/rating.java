/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

/**
 *
 * @author ASUS
 */
//public class rating {
    

//public class Rating {
//    private int idTukang;
//    private int pesananId;
//    private int idCustomer;
//    private int rating;
//    private String ulasan;
//
//    public Rating(int idTukang, int pesananId, int idCustomer, int rating, String ulasan) {
//        this.idTukang = idTukang;
//        this.pesananId = pesananId;
//        this.idCustomer = idCustomer;
//        this.rating = rating;
//        this.ulasan = ulasan;
//    }
//
//    public int getIdTukang() {
//        return idTukang;
//    }
//
//    public void setIdTukang(int idTukang) {
//        this.idTukang = idTukang;
//    }
//
//    public int getPesananId() {
//        return pesananId;
//    }
//
//    public void setPesananId(int pesananId) {
//        this.pesananId = pesananId;
//    }
//
//    public int getIdCustomer() {
//        return idCustomer;
//    }
//
//    public void setIdCustomer(int idCustomer) {
//        this.idCustomer = idCustomer;
//    }
//
//    public int getRating() {
//        return rating;
//    }
//
//    public void setRating(int rating) {
//        this.rating = rating;
//    }
//
//    public String getUlasan() {
//        return ulasan;
//    }
//
//    public void setUlasan(String ulasan) {
//        this.ulasan = ulasan;
//    }
//
//    @Override
//    public String toString() {
//        return "Rating{" +
//                "idTukang=" + idTukang +
//                ", pesananId=" + pesananId +
//                ", idCustomer=" + idCustomer +
//                ", rating=" + rating +
//                ", ulasan='" + ulasan + '\'' +
//                '}';
//    }
//}

    
//}
public class rating {
    private int id;
    private int idTukang;
    private int pesananId;
    private int idCostumer;
    private int rating;
    private String ulasan;

    public rating(int id, int idTukang, int pesananId, int idCostumer, int rating, String ulasan) {
        this.id = id;
        this.idTukang = idTukang;
        this.pesananId = pesananId;
        this.idCostumer = idCostumer;
        this.rating = rating;
        this.ulasan = ulasan;
    }

    public int getId() {
        return id;
    }

    public int getIdTukang() {
        return idTukang;
    }

    public int getPesananId() {
        return pesananId;
    }

    public int getIdCostumer() {
        return idCostumer;
    }

    public int getRating() {
        return rating;
    }

    public String getUlasan() {
        return ulasan;
    }
}
