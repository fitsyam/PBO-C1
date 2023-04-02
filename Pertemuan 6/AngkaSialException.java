/** 
* File      : AngkaSialException.java
* Penulis   : Fitra Syamli Yuhdhisaputra - 24060121140124
* Deskripsi : Eksepsi buat sendiri, menolak masukan angka 13!
* Tanggal   : 2/4/2023
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukan angka 13 karena angka sial !!!");
	}
}
