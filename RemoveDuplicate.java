import java.util.HashSet;

class RemoveDuplicates {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void removeDuplicates() {
        HashSet<Integer> hs = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null) {
            int cur = current.data;

            if (hs.contains(cur)) {
                prev.next = current.next;
            } else {
                hs.add(cur);
                prev = current;
            }
            current = current.next;
        }

    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicates llist = new RemoveDuplicates();
        llist.push(5);
        llist.push(5);
        llist.push(2);
        llist.push(1);
        llist.push(5);
        llist.push(3);
        llist.push(2);
        llist.push(12);
        llist.push(5);
        llist.push(2);

        System.out.println("Linked List before removing duplicates :");
        llist.printList();

        llist.removeDuplicates();

        System.out.println("Linked List after removing duplicates :");
        llist.printList();
    }
}

