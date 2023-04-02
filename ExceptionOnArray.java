/** 
* File      : ExceptionOnArray.java
* Penulis   : Fitra Syamli Yuhdhisaputra - 24060121140124
* Deskripsi : Program penggunaan eksepsi menggunakan class library java
* Tanggal   : 2/4/2023
*/

public class ExceptionOnArray{
	public static void main(String[] args){
		//instansiasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}catch(ArrayIndexOutOfBoundException exception){
			exception.printStackTrace();
		}finally{
			System.out.println("clean up code...");
		}
	}
}