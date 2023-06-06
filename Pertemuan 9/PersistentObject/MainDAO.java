/**
 * Penulis : Fitra Syamli Yudhisaputra - 24060121140124 
 * Tanggal : 31/05/2023
 * File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
**/

public class MainDAO{
    public static void main(String args[]){
        Person person = new Person ("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO (new MySQLPersonDAO());
        try{
            m.getPersonDAO().SavePerson(person);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}