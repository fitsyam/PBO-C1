/**
 *Penulis : Fitra Syamli Y 17/05/2023
 * File : BangunDatarGeneric.java
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
**/
public class BangunDatarGeneric<T3 extends BangunDatar>{
	private T3 bangunDatar;
	
	public void set(T3 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T3 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}


//Jika  mengganti karakter 'T' (dan semua 'T') pada file Java BangunDatarGeneric.java dengan karakter lain seperti T1, T2, atau T1234, maka perlu melakukan tindakan berikut:

// - Melakukan pencarian dan penggantian karakter 'T' (dan semua 'T') dengan karakter yang baru, seperti T1, T2, atau T1234.
// - Memperbarui semua referensi ke variabel 'T' (dan semua 'T') dalam program dengan karakter baru yang  dipilih, seperti T1, T2, atau T1234.