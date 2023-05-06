/**
 * File      : Programmer.java		
 * Penulis   : Fitra Syamli Yudhisaputra / 24060121140124
 * Deskripsi : Programmer.java adalah sub kelas dari pegawai yang berisi Atribut dan Metode untuk Programmer
 * Tanggal   : 06/05/23
 */
 
public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer (String nama) {
        super.setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("bonus : " + this.bonus);
    }
}