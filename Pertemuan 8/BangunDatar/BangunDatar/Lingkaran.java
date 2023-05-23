/**
 *Penulis : Fitra Syamli Y 17/05/2023
 * File : Lingkaran.java
 * Deskripsi : implemntasi lingkaran sebagai BangunDatar
**/
public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}