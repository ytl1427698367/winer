package com.na;

/**
 * Author：TaiLong
 * created:2019/8/20
 */
//删除链表中所有包含Val的节点
    /*
    * 解题思路
    * 遍历节点中每一个节点，判断节点的值
    * 如果是va;，删除该节点
    * 如何删除节点？需要该节点的前驱节点
    * 第一个节点没有前驱，必须特殊处理*/
public class Node {
    int value;
    Node next;
    private Node head;

    public Node(int value) {
        this.value = value;
    }
    Node removeAll(Node head, int value){
    Node prve=head;
    Node cur=head.next;
    if(head==null){
        return null;
    }
    while(cur!=null){
        if(cur.value==value){
            prve.next=cur.next;
        }
        else{
            prve=cur;
        }
    }
    return  head;
    }
Node RemaveAll(Node head,int value){
        Node pre=head;
        Node cur=pre.next;
        Node prs=new Node(value);
        if(pre==null){
            return null;
        }
       while(cur!=null){
            if(cur.value!=value){
                prs=pre;
                prs.next=cur;
                cur=pre;
            }
            else{
                pre=cur;
            }
       }
       return prs;

}
Node lastpush(Node head,int value){
        Node last=new Node(value);
        Node cur=head;
        if(cur==null){
            return last;
        }
        while(cur.next!=null){
            cur=cur.next;
        }
        cur.next=last;
        return cur;
}
/*
* 链表的逆置
* 大思路：遍历链表，把每个遍历到节点，头插到新的链表*/
Node reverse(Node head){
    Node cur=head;
    Node newHead=null;
    while(cur!=null){

        cur.next=newHead;
        newHead=cur;
    }
    return cur;
}

}












