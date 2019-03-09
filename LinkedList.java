class Node {
   String nama;
   String nim;
   Integer umur;
   Node next;
}
public class LinkedList {
    public static void main(String[] args) {
        Node current = null;
        Node first = new Node();   //Create Node first
        Node second = new Node();  //Create Node second
        first.nama = "Bayu Kanigoro";
	first.nim = "12345";
	first.umur = 5;
        first.next = second;
        second.nama = "D3366";
	second.nim = "23456";
	second.umur = 24;
        second.next = null;
        current = first; //Set pointer to node first
        while(current != null) {
	    System.out.println(current.nama + " " + current.nim + " " + current.umur);
            current = current.next;
	};
    }

}
