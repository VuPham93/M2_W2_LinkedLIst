public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList myLinkedList = new MyLinkedList(4);
        myLinkedList.addLast(7);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        myLinkedList.add(4,"6");
        myLinkedList.add(4,5);
        myLinkedList.addLast(8);
        myLinkedList.addLast(9);
        myLinkedList.add(10);

        System.out.print("Link list: ");
        myLinkedList.printList();
        System.out.println("Size = " + myLinkedList.size());

        System.out.println("Linklist is contains value 5 = " + myLinkedList.contains(5));
        System.out.println("Linklist is contains value 16 = " + myLinkedList.contains(16));
        System.out.println("Index of value 8 in linklist = " + myLinkedList.indexOf(8));
        System.out.println("First value in linklist = " + myLinkedList.getFirst());
        System.out.println("Last value in linklist = " + myLinkedList.getLast());
        System.out.println("Value in position 4 of linklist = " + myLinkedList.get(4));

        myLinkedList.remove(4);
        System.out.print("Linklist after remove object at position 4: ");
        myLinkedList.printList();

        myLinkedList.remove("6");
        System.out.print("Linklist after remove object (6): ");
        myLinkedList.printList();

        MyLinkedList clone = (MyLinkedList) myLinkedList.clone();
        System.out.print("Clone of linklist: ");
        clone.printList();

        myLinkedList.clear();
        System.out.print("Linklist after clear: ");
        myLinkedList.printList();

    }
}