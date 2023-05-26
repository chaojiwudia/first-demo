package com.zgy.learn.easypoi.service;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(5);
        listNode.next = listNode1;
        listNode1.next = listNode2;

        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(1);
        listNode4.next = listNode3;
        listNode3.next = listNode1;

        ListNode listNode5 = new ListNode(2);
        ListNode listNode6 = new ListNode(6);
        listNode5.next = listNode6;

        ListNode[] listNodes = {listNode,listNode4,listNode5};

        ListNode listNode7 = mergeKLists(listNodes);
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0){
            return null;
        }
        ListNode dummyHead = new ListNode(0);
        // 首节点
        ListNode curr = dummyHead;
        // 定义一个优先队列
        PriorityQueue<ListNode> listNodes = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                // 重写比较方法
                return o1.val - o2.val;
            }
        });

        for (ListNode list : lists) {
            if (list == null){
                continue;
            }
            // 把链表加入到队列中
            listNodes.add(list);
        }
        while (!listNodes.isEmpty()){
            // 弹出第一个队列
            ListNode nextNode = listNodes.poll();
            curr.next = nextNode;
            curr = curr.next;
            if (nextNode.next != null){
                listNodes.add(nextNode.next);
            }
        }
        return dummyHead.next;
    }
}
