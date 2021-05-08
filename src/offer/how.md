#### [剑指 Offer 06. 从尾到头打印链表](https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/)

> 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
>
> 解题思路1：先遍历个数，再倒序读取出来，时间复杂度为O(2N)，空间复杂度为O(1)
>
> [Offer01.java](Offer01.java)

#### [剑指 Offer 24. 反转链表](https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/)

> 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
>
> 解题思路1：快慢指针法
>
> [Offer02.java](Offer02.java)

#### [剑指 Offer 53 - II. 0～n-1中缺失的数字](https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/)

> 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
>
> 解题思路1：二分法，区别于一般二分：跳出条件为不等的时候
>
> [Offer03.java](Offer03.java)

#### [剑指 Offer 57. 和为s的两个数字](https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/)

> 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
>
> 解题思路1：
>
> > 以查找值得中间值为下界限，以target为上界限，查找两个界限得a,b：O(N)
> >
> > 再遍历[a+1,b)得值，并将该值和target相减，再用二分法从[0,a]查找相减后得值，存在就为结果：O(NlogN)
> >
> > N得界限视实际情况为定，平均应该为数组长度得一半吧
>
> [Offer04.java](Offer04.java)

#### [剑指 Offer 03. 数组中重复的数字](https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/)

> 找出数组中重复的数字。
>
> 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
>
> **限制：2 <= n <= 100000**
>
> 解题思路1：利用限制范围2<=n<=100000，修改元素加100001，利用下标作Hash，当出现冲突时，就是要找到的值了(也可以利用相反数)，时间复杂度为O(N)，空间复杂度为O(1)：如果要不更改数组，那么能复原之后就不是修改咯。
>
> [Offer05.java](Offer05.java)

#### [剑指 Offer 53 - I. 在排序数组中查找数字 I](https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/)

> 统计一个数字在排序数组中出现的次数。
>
> 解题思路1：先用二分法找到是否该数，并返回下标；然后向两边查找统计个数。时间复杂度为O(logN) - O(N)，空间复杂度为O(1)
>
> [Offer06.java](Offer06.java)

