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

#### [剑指 Offer 40. 最小的k个数](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/)

> 输入整数数组 `arr` ，找出其中最小的 `k` 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
>
> 解题思路1：遍历，获得新数组时：可以使用Arrays.copyOf节省空间
>
> [DoubleSix02.java](DoubleSix02.java)
>
> 解题思路2：堆
>
> 解题思路3：简化版的快速排序

#### [74. 搜索二维矩阵](https://leetcode-cn.com/problems/search-a-2d-matrix/)

> 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
>
> 每行中的整数从左到右按升序排列。
> 每行的第一个整数大于前一行的最后一个整数。
>
> 解题思路1：二分法：temp：可以节省为matrix[0].length - 1，时间复杂度100%，空间复杂度14%(可以用堆栈进行二分法会节省一点)
>
> [DoubleSix03.java](DoubleSix03.java)

