/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if(head == null || head.next == null) return false;
    Node tmp = head.next;
    int count = 1;
    while(count <= 100) {
        if(tmp.next != null){
            tmp = tmp.next;
        } else{
            return false;
        }
        count++;
    }
    return true;
}