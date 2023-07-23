public class MergeAndSortLinkedList {
    
    class Node {
        int data;
        Node next;   
    }
 
    public Node newLinkedList(int n) {
        Node head = new Node();
        head.data = n;
        head.next = null;
        return head;
    }

    public void insertNode(Node head, int n) {
        Node cur = head;
        while(cur.next != null) 
            cur = cur.next;
        Node temp = new Node();
        temp.data = n;
        temp.next = null;
        cur.next = temp;
    }

    public void merge(Node head1, Node head2) {
        Node cur = head1;
        while(cur.next != null) 
            cur = cur.next;
        cur.next = head2;
    }

    //using bubble sort
    public void bubbleSort(Node head) {
        Node cur = head;
        while(cur != null) {
            Node temp = cur.next;
            while(temp != null) {
                if(cur.data > temp.data) {
                    int t = cur.data;
                    cur.data = temp.data;
                    temp.data = t;
                }
                temp = temp.next;
            }
            cur = cur.next;
        }
    }

    public void display(Node head){
        Node cur = head;
        while(cur != null) {
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
    }
    
    public static void main(String[] args) {
        MergeAndSortLinkedList m = new MergeAndSortLinkedList();
        Node head1 = m.newLinkedList(5);
        Node head2 = m.newLinkedList(2);

        m.insertNode(head1, 25); //25->35->12->4->36->48
        m.insertNode(head1, 35);
        m.insertNode(head1, 12);
        m.insertNode(head1, 4);
        m.insertNode(head1, 36);
        m.insertNode(head1, 48);

        m.insertNode(head2, 8);  // 8->32->22->45->63->49
        m.insertNode(head2, 32);
        m.insertNode(head2, 22);
        m.insertNode(head2, 45);
        m.insertNode(head2, 63);
        m.insertNode(head2, 49);

        m.merge(head1, head2);
        m.bubbleSort(head1);

        m.display(head1);
    }
}