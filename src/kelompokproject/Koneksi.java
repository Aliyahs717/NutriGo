/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompokproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Tinkpad
 */
public class Koneksi {
    private static Connection koneksi;
    
    public static Connection connect() {
        if (koneksi == null) {
            try {
                // Sesuaikan URL, user, dan password dengan database MySQL kamu
                String url = "jdbc:mysql://localhost:3306/profilbaru"; // ganti dengan nama database kamu
                String user = "root"; // ganti dengan user database kamu (default: root)
                String password = ""; // ganti dengan password database kamu

                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil!");
            } catch (SQLException e) {
                System.out.println("Koneksi Gagal: " + e.getMessage());
            }
        }
        return koneksi;
    }
    
    
}
