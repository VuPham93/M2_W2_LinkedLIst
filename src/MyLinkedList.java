public class MyLinkedList {
    private  Node head;
    private  int numNodes = 1;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for(int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        Node temp = head;
        for(int i = 0; temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }

    public Object remove(int index) {
        Node temp = head;
        Node holder;
        for(int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp;
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        numNodes--;
        return (Object) holder;
    }

    public boolean remove(Object data) {
        Node temp = head;
        for(int i = 0; temp.next != null; i++) {
            if (temp.next.getData() == data) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        numNodes--;
        return true;
    }

    public int size() {
        return numNodes;
    }

    public Object clone() {
        Node temp = head.next;
        Object data = head.getData();
        MyLinkedList clone = new MyLinkedList(data);
        for (int i = 0; i < numNodes - 1; i++) {
            clone.add(temp.getData());
            temp = temp.next;
        }
        return clone;
    }

    public boolean contains(Object data) {
        Node temp = head;
        for(int i = 0; temp.next != null; i++) {
            if (data == temp.getData())
                return true;
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object data) {
        Node temp = head;
        for(int i = 0; temp.next != null; i++) {
            if (data == temp.getData())
                return i;
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(Object data) {
        Node temp = head;
        for(int i = 0; temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
        return true;
    }

    public Object get(int index){
        Node temp = head;
        for(int i = 0; i<index; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public Object getFirst(){
        return head.getData();
    }

    public Object getLast(){
        Node temp = head;
        for(int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print("\t" + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public void  clear() {
        head = null;
        numNodes = 0;
    }
}
