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

#### [剑指 Offer 15. 二进制中1的个数](https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/)

> 请实现一个函数，输入一个整数（以二进制串形式），输出该数二进制表示中 1 的个数。例如，把 9 表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2。
>
> 解题思路1：无符号右移和右移的区别是什么？
>
> [Offer07.java](Offer07.java)

#### [剑指 Offer 11. 旋转数组的最小数字](https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/)

> 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 `[3,4,5,1,2]` 为 `[1,2,3,4,5]` 的一个旋转，该数组的最小值为1。 
>
> 解题思路1：遍历
>
> [Offer08.java](Offer08.java)

#### [剑指 Offer 10- II. 青蛙跳台阶问题](https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/)

> 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
>
> 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
>
> 解题思路1：动态规划
>
> [Offer09.java](Offer09.java)

#### [剑指 Offer 25. 合并两个排序的链表](https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/)

> 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
>
> 解题思路1：类似插入排序吧
>
> [Offer10.java](Offer10.java)

#### [剑指 Offer 17. 打印从1到最大的n位数](https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/)

> 输入数字 `n`，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
>
> 解题思路1：遍历
>
> [Offer11.java](Offer11.java)