#### [剑指 Offer 52. 两个链表的第一个公共节点](https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/)

> 如果两个链表没有交点，返回 null.
> 在返回结果后，两个链表仍须保持原有的结构。
> 可假定整个链表结构中没有循环。
> 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
> 本题与主站 160 题相同：https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
>
> 解题思路1：两者同时遍历，且到末尾，就往另一条链表开始，最后会相遇到交叉节点
>
> > 1. 边界问题，null链表？
> > 2. 实现逻辑是否与思路一致？
>
> [DoubleSix01.java](DoubleSix01.java)

