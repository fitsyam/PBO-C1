/*Nama: Fitra Syamli Yudhisaputra */
/*Nim: 24060121140124*/
/*Tanggal: 05/03/2023 */
/*Deskripsi: class untuk MOperasiTitik */

class MOperasiTitik{
	public static void main(String[]args){
		Titik t1 = new Titik(4.0, 4.0);
		OperasiTitik op = new OperasiTitik();
		
		System.out.println("Titik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		
		op.refleksiX(t1);
		System.out.println("Titik setelah refleksi sumbu X");
		System.out.println("Titik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		
		op.refleksiY(t1);
		System.out.println("Titik setelah refleksi sumbu Y");
		System.out.println("Titik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		
		
	}
}