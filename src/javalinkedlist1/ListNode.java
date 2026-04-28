package javalinkedlist1;

public class ListNode {
    int data;
    ListNode next;

    ListNode() {
        this.data = -1;
        this.next = null; }

    ListNode(int data) {
        this.data = data;
        this.next = null; }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next; }
}
