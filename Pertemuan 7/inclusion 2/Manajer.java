/**
 * File      : Manajer.java		
 * Penulis   : Fitra Syamli Yudhisaputra / 24060121140124
 * Deskripsi : Manajer.java adalah sub kelas dari pegawai yang berisi Atribut dan Metode untuk Manajer
 * Tanggal   : 06/05/23
 */

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer (String nama) {
        super.setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}