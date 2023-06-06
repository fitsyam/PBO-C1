
/**
 * Penulis : Fitra Syamli Yudhisaputra - 24060121140124 
 * Tanggal : 31/05/2023
 * File : LambdaList.java
 * Deskripsi : implementasi lambda pada list, digunakan sebagai parameter pada method
**/
import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakab sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}