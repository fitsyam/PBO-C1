/**
 *Penulis : Fitra Syamli Y 17/05/2023
 * File : BangunDatarGenericTest.java
 * Deskripsi : main class untuk generic untuk bangun datar
**/
public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(lingkaran1);
        System.out.println("keliling lingkaran : " + bdg.get().hitungKeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getSimpleName());
    }
}