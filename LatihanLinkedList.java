import java.util.*;

public class LatihanLinkedList{
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 10);
        arrayList.add(3, 30);

        System.out.println("List Integer dalam ArrayList");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
        linkedList.add(1, "merah");
        linkedList.removeLast();
        linkedList.addFirst("hijau");

        System.out.println("Forward LinkedList");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next() + " ");
        }
        System.out.println();
        System.out.println("Backward LinkedList");
        listIterator = linkedList.listIterator(linkedList.size());
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }

    }
}