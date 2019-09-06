package com.SortColection;

public class MyLinkedList {
    public static class Node {
        /**
         * 值
         */
        public int value;

        /**
         * 下一个结点的引用，如果 next == null，表示没有下一个结点了
         */
        public Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    /**
     * 链表中的第一个结点的引用，如果 head == null，则链表中一个结点都没有
     */
    public Node head;

    MyLinkedList() {
        this.head = null;
    }

    /**
     * 头插
     * @param node 已经 new 好的 Node 对象
     */
    void pushFront(Node node) {
        node.next = this.head;
        this.head = node;
    }
    public static class Nodes{
        int value;
        Nodes next;
        Nodes(int value){
            this.value=value;
            this.next=null;
        }
    }
//头插
    public Nodes heads;
    void  pushFront(Nodes nodes){
        nodes.next=this.heads;
        this.heads=nodes;
    }
    //尾插
    void pushBack(Nodes nodes){
        if(this.heads==null){
            this.heads=nodes;
        }
        else{
            Nodes last=LastNode();
            last.next=nodes;
        }
    }
    public Nodes LastNode(){//返回链表中最后一个节点
        if(this.heads==null){
            throw  new Error();
        }
        Nodes last=this.heads;
        while(last!=null){
            last=last.next;
        }
        return last;
    }
    /**
     * 尾插
     * @param node 已经 new 好的 Node 对象
     */
    public void pushBack(Node node) {
        node.next = null;
        if (this.head == null) {
            this.head = node;
        } else {
            // 找链表的最后一个结点
            Node last = getLast();
            last.next = node;
        }
    }

    /**
     * 查找链表的最后一个结点，前提是链表中至少有一个结点
     * @return 链表的最后一个结点
     */
    private Node getLast() {
        if (this.head == null) {
            throw new Error();
        }

        Node last = this.head;
        while (last.next != null) {
            last = last.next;
        }

        return last;
    }
//头删
    void pushDelectable(Nodes nodes){
        if(heads.next==null){
          this.heads=null;
        }
        else{
            heads.next=heads;
        }
    }
    //尾删
    void backDelect(Nodes nodes){
        Nodes cur=this.heads;
        if(cur.next==null){
            this.heads=null;
        }

        while(cur.next!=null){
            nodes.next=null;
            nodes=nodes.next;
        }
    }
    public void display() {
        // 如何通过循环，遍历链表的每一个结点
        Nodes cur = this.heads;
        while (cur != null) {
            System.out.format("%d --> ", cur.value);

            cur = cur.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        /*
        list.pushFront(new Node(1));
        list.pushFront(new Node(2));
        list.pushFront(new Node(3));

        list.display(); // 3 --> 2 --> 1 --> null
        */

      // list.pushBack(new Node(10));
//        list.pushBack(new Node(20));
//        list.pushBack(new Node(30));
        list.pushBack(new Nodes(20));
         list.pushFront(new Nodes(20));
         list.pushDelectable(new Nodes(20));
        list.display();
    }
}
