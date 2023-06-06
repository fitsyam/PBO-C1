/**
 * Penulis : Fitra Syamli Yudhisaputra - 24060121140124 
 * Tanggal : 31/05/2023
 * File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDAO untuk MySQL
**/
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    public void SavePerson(Person person) throws Exception{
        String name = person.getName();
        //membuat koneksi,nama db,user,password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
						"jdbc:mysql://localhost/pbo","root","dawang123");
    //kerjakan mysql query
    String query = "INSERT INTO person(name) VALUES ('"+name+"')";
    System.out.println(query);
    Statement s = con.createStatement();
    s.executeUpdate(query);
    //tutup koneksi database
    con.close();
    }
}
