/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;


import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;
import java.sql.SQLException;

public class koneksi {

    private static Connection koneksi;

    public static Connection GetConnection() throws SQLException {
        if (koneksi == null) {
            new Driver();
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/pbo_praktikum", "root", "");
        }
            return koneksi;
    }

}
