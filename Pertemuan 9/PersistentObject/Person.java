/**
 * Penulis : Fitra Syamli Yudhisaputra - 24060121140124 
 * Tanggal : 31/05/2023
 * File : Person.java
 * Deskripsi : person database model
**/

public class Person{
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}