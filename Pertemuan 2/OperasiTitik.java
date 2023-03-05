/*Nama: Fitra Syamli Yudhisaputra */
/*Nim: 24060121140124*/
/*Tanggal: 05/03/2023 */
/*Deskripsi: class untuk OperasiTitik */

class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		ordinat = ordinat * -1;
		titik.setOrdinat(ordinat);
	}
	
	private void refleksiSumbuY(Titik titik){
		double absis = titik.getAbsis();
		absis = absis * -1;
		titik.setAbsis(absis);
	}
	
	public Titik refleksiX(Titik titik){
		refleksiSumbuX(titik);
		return titik;
	}
	
	public Titik refleksiY(Titik titik){
		refleksiSumbuY(titik);
		return titik;
	}
}