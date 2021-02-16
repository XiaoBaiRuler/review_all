#### [485. 最大连续1的个数](https://leetcode-cn.com/problems/max-consecutive-ones/)

> 给定一个二进制数组， 计算其中最大连续1的个数。
>
> 解题思路：遍历，求最大值，遇到非1(就比较一次)，最后也比较一次
>
> [代码](OneDay01.java)

#### [561. 数组拆分 I](https://leetcode-cn.com/problems/array-partition-i/)

> 给定长度为 2n 的整数数组 nums ，你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到 n 的 min(ai, bi) 总和最大。
>
> 返回该 最大总和 。
>
> 解题思路1：排序，找出索引为偶数的相加就行了
>
> [代码](OneDay02.java)