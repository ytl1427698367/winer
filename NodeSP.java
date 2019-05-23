package Sort;

/**
 * Author：TaiLong
 * created:2019/5/17
 */

/**
 * 定义一个node类
 */
public class NodeSP {
    public static class Node {
        //定义一个链表类
        public int value;
        public Node next;//代表下一个节点

        Node(int value) {
            this.value = value;
            this.next = null;
        }
        }
    public  Node head;
    //头插
   void pushFront(Node node){
       node.next=this.head;
       this.head=node;
       }
       void pushBack(Node node){
       Node last=head;
       if(node==null){
           this.head=node;
       }
       while(last.next!=null){
           last=last.next;
       }
       last.next=node;
       }

    /**
     * 删除链表中重复的节点
     */
    public void DelectReptationNode() {
        Node cur = head;
        while (cur.next != null) {
            if (cur.value == cur.next.value) {
                cur.next = cur.next.next;

            }

        }
    }

    /**
     * 复制复杂链表
     */
    void copyNode(Node node){
        Node cur=head;
    }
    /**
     * 打印链表
     */
    public void display(){
       Node cur=head;
       while(cur!=null){
           System.out.format("%d-->",cur.value);
           cur=cur.next;
       }
           System.out.println("null");


       }

       public static void main(String[] args){
        NodeSP n=new NodeSP();
        n.pushFront(new Node(210));
        n.pushFront(new Node(12));
        n.pushBack(new Node (45));
        n.pushBack(new Node (45));

        n.DelectReptationNode();
        n.display();
       }

    }



















