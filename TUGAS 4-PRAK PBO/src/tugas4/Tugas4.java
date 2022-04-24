/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class Tugas4 {
 String url  = "jdbc:mysql://localhost/tugas4";
        String username = "root";
        String password = "";
        Connection conn;
        Statement statement;
        public Tugas4() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Koneksi Berhasil");
        }
        catch (Exception e) {
            System.err.println ("Koneksi gagal"+ e.getMessage());
        }
    }
}