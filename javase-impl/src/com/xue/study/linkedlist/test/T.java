package com.xue.study.linkedlist.test;

public class T {
    class Node{
        private Node next;
        private Object val;

        public void setNext(Node next) {
            this.next = next;
        }

        public void setVal(Object val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public Object getVal() {
            return val;
        }
    }

    private Node root = new Node();
    private Node last;
    private int size;

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        T linkedlist = new T();
        int num = linkedlist.size - 1;
        Node root = linkedlist.root;
        Node last = linkedlist.last;

        for (int i = 0; i < num; i++) {
            Node node = root.getNext();
            for (int j = 0; j < num - i - 1; j++) {
                node = node.getNext();
            }

            node.setNext(null);
            last.setNext(node);
            last = node;
        }
        num--;
    }
}
