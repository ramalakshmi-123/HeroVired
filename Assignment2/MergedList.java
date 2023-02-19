public class MergedList {

    static node head1 = null;
    static node head2 = null;

    static class node {
        int data;
        node next;
    };

    static void printList(node head) {
        node tmp;

        tmp = head;

        while (tmp.next != null) {
            System.out.print(tmp.data + " -> ");
            tmp = tmp.next;
        }
        System.out.println(tmp.data );
    }

    static node AddNode(node head, int num) {
        node temp = new node();
        node tail = head;

        temp.data = num;
        temp.next = null;
        if (head == null) {
            head = temp;
            tail = temp;
        }
        else {
            while (tail != null) {
                if (tail.next == null) {
                    tail.next = temp;
                    tail = tail.next;
                }
                tail = tail.next;
            }
        }

        return head;
    }
    static node concatenateList() {
        node tail = head1;

        while (tail != null) {
            if (tail.next == null && head2 != null) {
                tail.next = head2;
                break;
            }
            tail = tail.next;
        }

        return head1;
    }
    static void sort() {
        node current = head1;
        node temp = head1;
        while (current.next != null) {
            temp = current.next;
            while (temp != null) {
                if (temp.data < current.data) {
                    int t = temp.data;
                    temp.data = current.data;
                    current.data = t;
                }
                temp = temp.next;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        head1 = AddNode(head1, 25);
        head1 = AddNode(head1, 35);
        head1 = AddNode(head1, 12);
        head1 = AddNode(head1, 4);
        head1 = AddNode(head1, 36);
        head1 = AddNode(head1, 48);
        System.out.println("List1:");
        printList(head1);
        head2 = AddNode(head2, 8);
        head2 = AddNode(head2, 32);
        head2 = AddNode(head2, 22);
        head2 = AddNode(head2, 45);
        head2 = AddNode(head2, 63);
        head2 = AddNode(head2, 49);
        System.out.println("List2:");
        printList(head2);

        head1 = concatenateList();

        sort();
        System.out.println("Final merged list:");
        printList(head1);
    }
}
