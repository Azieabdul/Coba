/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jon
 */
public class koneksi {
    
    public ResultSet hasilset;
    public Statement keputusan;
    public String bahasaSQL;
    
    private static Connection con;
    
   public void kooneksi(){
        try {
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/restoran","root","");
            keputusan = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"gagal konek");
        }
  
}
    
     public void crud(){
        try {
            kooneksi();
            keputusan.executeUpdate(bahasaSQL);
        } catch (Exception e) {
            System.out.println(e);
        }
}
  public void ambil(){
        try {
            kooneksi();
            hasilset = keputusan.executeQuery(bahasaSQL);
        } catch (Exception e) {
        }
    }
}
