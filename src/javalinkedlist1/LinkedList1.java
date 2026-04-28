package javalinkedlist1;

public class LinkedList1 {
    public static void main(String[] args) {

        ListNode a = new ListNode(10);
        a.next = new ListNode(20);
        a.next.next = new ListNode(30);

        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);

    }
}
