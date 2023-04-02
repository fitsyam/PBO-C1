/** 
* File      : MLingkaran.java
* Penulis   : Fitra Syamli Yudhisaputra - 24060121140124
* Deskripsi : Implementasi cara menghitung luas lingkaran
* Tanggal   : 1/4/2023
*/

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan jari-jari lingkaran : ");
		double jejari = scan.nextDouble();
		Lingkaran l = new Lingkaran(jejari);
		System.out.println("Luas lingkaran dengan jari-jari "+jejari+" satuan adalah "+l.hitungLuas());
	}
}