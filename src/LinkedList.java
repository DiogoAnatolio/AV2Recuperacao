public class LinkedList<E> {
    public LinkedListNode<E> head;

    public void add(E data) {
        LinkedListNode<E> newNode = new LinkedListNode<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        LinkedListNode<E> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}