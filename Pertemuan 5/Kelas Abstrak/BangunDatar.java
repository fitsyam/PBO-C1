/** 
* File      : BangunDatar.java
* Penulis   : Fitra Syamli Yudhisaputra - 24060121140124
* Deskripsi : Kelas abstrak, berisi abtraksi bangun datar
* Tanggal   : 1/4/2023
*/

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi); 

    public void setLuas(double l){ 
        luas = 1;
    }

    public double getLuas(){ 
        return luas;
    }
}