/**
 * File      : PegawaiDanGaji.java		
 * Penulis   : Fitra Syamli Yudhisaputra / 24060121140124
 * Deskripsi : PegawaiDanGaji.java adalah main kelas untuk menjalankan class Pegawai dan class Manajer
 * Tanggal   : 06/05/23
 */
 
public class PegawaiDanGaji {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}