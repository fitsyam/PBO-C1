/** 
* File      : AngkaSial.java
* Penulis   : Fitra Syamli Yuhdhisaputra - 24060121140124
* Deskripsi : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
* Tanggal   : 2/4/2023
*/

public class AngkaSial{
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new  AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial"); // dapat di ekesekusi karena telah diberikan mekanisme berupa catch pada baris ke 21
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){  //method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukan angka !!!");
		}
	}
}

