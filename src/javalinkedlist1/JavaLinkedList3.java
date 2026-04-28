package javalinkedlist1;

public class JavaLinkedList3 {
    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        a.next = new ListNode(20);
        a.next.next = new ListNode(30);

        a = addFirst(a, 5);
        a = addMiddle(a, 2, 35); // 2. indise ekleme yapÄ±yor yani 3. eleman oluyor

        ListNode start = a;
        while(start != null) {
            System.out.println(start.data);
            start = start.next; }

        System.out.println("---------------------");

        a = remove(a, 1);

        start = a;
        while(start != null) {
            System.out.println(start.data);
            start = start.next; }

    }

    static ListNode addFirst(ListNode b, int value) {
        ListNode c = new ListNode(value, b);
        return c;
    }

    static ListNode addMiddle(ListNode b, int index, int value) {
        ListNode c = b;
        for(int i = 1; i<index; i++) {
            c = c.next;
        }
        ListNode add = new ListNode(value, c.next);
        c.next = add;
        return b;
    }

    static ListNode remove(ListNode b, int index) {
        ListNode c = b;
        for(int i = 1; i<index; i++) {
            c = c.next;
        }
        c.next = c.next.next;
        return b;
    }
}
