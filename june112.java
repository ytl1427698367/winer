package com.practise;

import java.util.List;

/**
 * Author：TaiLong
 * created:2019/6/12
 */
public class june112 {



    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode partition(ListNode pHead, int x) {
                // write code here
                ListNode result1 = null;
                ListNode result2 = null;
                ListNode tail1 = null;
                ListNode tail2 = null;
                ListNode c = pHead;
                while (c != null) {
                    ListNode next = c.next;
                    if (c.val < x) {/* 小的尾插 */
                        c.next=null;
                        if (result1 == null) {
                            result1 = c;
                        } else {
                            tail1.next = c;

                        }
                        tail1 = c;
                    } else {//大的尾插
                        c.next = null;
                        if (result2 == null) {
                            result2 = c;
                        } else {
                            tail2.next = c;

                        }
                        tail2 = c;
                    }
                    c =next;
                }
                if (tail1 == null) {
                    return result2;
                } else {
                    tail1.next = result2;
                    return result1;
                }
            }
        }


