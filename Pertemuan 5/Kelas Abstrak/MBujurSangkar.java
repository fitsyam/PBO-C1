/** 
* File      : MBujurSangkar.java
* Penulis   : Fitra Syamli Yudhisaputra - 24060121140124
* Deskripsi : Kelas yang mengimplementasi cara menghitung luas bujur sangkar
* Tanggal   : 1/4/2023
*/

import java.util.Scanner;

class MBujurSangkar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();  

        System.out.println("Masukan sisi bujur sangkar : ");
        double sisi = scan.nextDouble(); 
        scan.close(); 
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
    }
}