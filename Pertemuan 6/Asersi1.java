/** 
* File      : Asersi1.java
* Penulis   : Fitra Syamli Yuhdhisaputra - 24060121140124
* Deskripsi : Program untuk menunjukan asersi
* Tanggal   : 2/4/2023
*/

public class Asersi1{
	public static void main(String[] args){
		int x = 0;
		if(x>0){
			System.out.println("x bilangan postif");
		}else{
			assert(x<0):"ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}
