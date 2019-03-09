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

class LinkedListCase {
  public static void main(String args[]) {
    LinkedList<Mahasiswa> m = new LinkedList<Mahasiswa>();

    m.add(new Mahasiswa("Agus", "123", 10));
    m.add(new Mahasiswa("Dono", "111", 12));
    m.add(new Mahasiswa("Tatatng", "888", 14));

    for (Mahasiswa element : m)
      System.out.println(element + "\n");

  }
}
