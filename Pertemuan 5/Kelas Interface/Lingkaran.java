/** 
* File      : Lingkaran.java
* Penulis   : Fitra Syamli Yudhisaputra - 24060121140124
* Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran
* Tanggal   : 1/4/2023
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}