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

#### [566. 重塑矩阵](https://leetcode-cn.com/problems/reshape-the-matrix/)

> 在MATLAB中，有一个非常有用的函数 reshape，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。
>
> 给出一个由二维数组表示的矩阵，以及两个正整数r和c，分别表示想要的重构的矩阵的行数和列数。
>
> 重构后的矩阵需要将原始矩阵的所有元素以相同的行遍历顺序填充。
>
> 如果具有给定参数的reshape操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
>
> 解题思路1：遍历
>
> [代码](OneDay03.java)

#### [697. 数组的度](https://leetcode-cn.com/problems/degree-of-an-array/)

> 给定一个非空且只包含非负数的整数数组 nums，数组的度的定义是指数组里任一元素出现频数的最大值。
>
> 你的任务是在 nums 中找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
>
> - `nums.length` 在1到 50,000 区间范围内。
> - `nums[i]` 是一个在 0 到 49,999 范围内的整数。
>
> 解题思路1：求出频率，再有大顶堆，找最大值，最后逐个求拥有相同大小度的最短连续子数组
>
> [代码](OneDay05.java)

#### [832. 翻转图像](https://leetcode-cn.com/problems/flipping-an-image/)

> 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
>
> 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
>
> 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
>
> 解题思路1：按照流程来的
>
> [代码](OneDay08.java)

#### [867. 转置矩阵](https://leetcode-cn.com/problems/transpose-matrix/)

> 给你一个二维整数数组 `matrix`， 返回 `matrix` 的 **转置矩阵** 。
>
> 矩阵的 **转置** 是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
>
> m == matrix.length
> n == matrix[i].length
> 1 <= m, n <= 1000
> 1 <= m * n <= 105
> -109 <= matrix[i][j] <= 109
>
> 解题思路1：为了节省空间：分两种情况讨论：宽高相同和不同
>
> [代码](OneDay09.java)

#### [219. 存在重复元素 II](https://leetcode-cn.com/problems/contains-duplicate-ii/)

> 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
>
> 解题思路1：HashMap
>
> [代码](OneDay10.java)

#### [896. 单调数列](https://leetcode-cn.com/problems/monotonic-array/)

> 如果数组是单调递增或单调递减的，那么它是单调的。
>
> 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
>
> 当给定的数组 A 是单调数组时返回 true，否则返回 false
>
> 解题思路1：两个标志位，来判断
>
> [代码](OneDay11.java)

#### [303. 区域和检索 - 数组不可变](https://leetcode-cn.com/problems/range-sum-query-immutable/)

> 给定一个整数数组  nums，求出数组从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点。
>
> 实现 NumArray 类：
>
> - NumArray(int[] nums) 使用数组 nums 初始化对象
> - int sumRange(int i, int j) 返回数组 nums 从索引 i 到 j（i ≤ j）范围内元素的总和，包含 i、j 两点（也是 sum(nums[i], nums[i + 1], ... , nums[j])）
>
> 提示：
>
> - 0 <= nums.length <= 104
> - -105 <= nums[i] <= 105
> - 0 <= i <= j < nums.length
> - 最多调用 104 次 sumRange 方法
>
> 解题思路1：空间复杂度较优：直接用原数组，来暴力计算
>
> 解题思路2：时间复杂度较优：构建另外一个数组存储前面元素之和的结果数组，每次求范围就计算
>
> [代码](OneDay12.java)

#### [338. 比特位计数](https://leetcode-cn.com/problems/counting-bits/)

> 给定一个非负整数 **num**。对于 **0 ≤ i ≤ num** 范围中的每个数字 **i** ，计算其二进制数中的 1 的数目并将它们作为数组返回
>
> 进阶:
>
> - 给出时间复杂度为O(n*sizeof(integer))的解答非常容易。但你可以在线性时间O(n)内用一趟扫描做到吗？
> - 要求算法的空间复杂度为O(n)。
> - 你能进一步完善解法吗？要求在C++或任何其他语言中不使用任何内置函数（如 C++ 中的 __builtin_popcount）来执行此操作。
>
> 解题思路1：直接计算
>
> [代码](OneDay13.java)
>
> 解题思路2：动态规划：维持最高有效位：hb = 2^i时，个数为1(判断标志：bb & (hb - 1)  == 0)
>
> 然后f(i) = f(i - hb) + 1
>
> [代码](OneDay13.java)

#### [232. 用栈实现队列](https://leetcode-cn.com/problems/implement-queue-using-stacks/)

> 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列的支持的所有操作（push、pop、peek、empty）：
>
> 实现 MyQueue 类：
>
> void push(int x) 将元素 x 推到队列的末尾
> int pop() 从队列的开头移除并返回元素
> int peek() 返回队列开头的元素
> boolean empty() 如果队列为空，返回 true ；否则，返回 false
>
>
> 说明：
>
> 你只能使用标准的栈操作 —— 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
> 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
>
>
> 进阶：
>
> 你能否实现每个操作均摊时间复杂度为 O(1) 的队列？换句话说，执行 n 个操作的总时间复杂度为 O(n) ，即使其中一个操作可能花费较长时间。
>
> 解题思路1：有元素都推进栈1，出元素或头元素都在stack2中拿(没有就把1中都倒进2)
>
> [代码](OneDay14.java)

#### [503. 下一个更大元素 II](https://leetcode-cn.com/problems/next-greater-element-ii/)

> 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。
>
> 解题思路1：玄学的循环：放弃这个思路
> 解题思路2：单调栈，模仿一个循环数组
>
> [代码](OneDay15.java)

#### [5680. 找到最近的有相同 X 或 Y 坐标的点](https://leetcode-cn.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/)

> 给你两个整数 x 和 y ，表示你在一个笛卡尔坐标系下的 (x, y) 处。同时，在同一个坐标系下给你一个数组 points ，其中 points[i] = [ai, bi] 表示在 (ai, bi) 处有一个点。当一个点与你所在的位置有相同的 x 坐标或者相同的 y 坐标时，我们称这个点是 有效的 。
>
> 请返回距离你当前位置 曼哈顿距离 最近的 有效 点的下标（下标从 0 开始）。如果有多个最近的有效点，请返回下标 最小 的一个。如果没有有效点，请返回 -1 。
>
> 两个点 (x1, y1) 和 (x2, y2) 之间的 曼哈顿距离 为 abs(x1 - x2) + abs(y1 - y2) 。
>
> 解题思路1：遍历，按要求做就行了
>
> [代码](OneDay16.java)

#### [1784. 检查二进制字符串字段](https://leetcode-cn.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/)

> 给你一个二进制字符串 s ，该字符串 不含前导零 。
>
> 如果 s 最多包含 一个由连续的 '1' 组成的字段 ，返回 true 。否则，返回 false 
>
> 解题思路1：判断第一次是否间隔重复出现1
>
> [代码](OneDay17.java)