import java.util.*;
import java.util.LinkedList;
class Mahasiswa {
  String nama;
  String nim;
  Integer umur;
  Mahasiswa(String n, String ni, Integer u) {
    nama = n;
    nim = ni;
    umur = u;
  }
  public String toString() {
    return nama + " " + nim + " " + umur.toString();
  }
}
class LinkedListCase{
  public static void main(String args[]) {
    LinkedList<Mahasiswa> l = new LinkedList<Mahasiswa>();
    for(int i=0; i<=3;i++)
    {
      Scanner input = new Scanner(System.in); //object scanner baru
      String nama, nim;
      Integer umur;
      System.out.println("|                 BIODATA                 |");
      System.out.println("===========================================");
      System.out.print("Nama \t\t: " );
      nama = input.nextLine();
      System.out.print("NIM \t\t: " );
      nim = input.nextLine();
      System.out.print("Umur \t: " );
      umur = input.nextInt();
      l.add(new Mahasiswa(nama, nim, umur));
    }
    System.out.println("|                 HASIL                   |");
    System.out.println("===========================================");
    for (Mahasiswa element : l)
      System.out.println(element + "\n");
  }
}
