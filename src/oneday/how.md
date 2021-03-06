## 问题

> 现在的做题没有提升了，并且老是出现重复的bug，并且有一些题目可能是任意人花费更多时间，就能够通过了，所以从现在开始：**简单题30分钟以内，中等题1小时以内，并且时间复杂度或空间复杂度两者需要达到超越70%以上才行**

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

#### [1047. 删除字符串中的所有相邻重复项](https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/)

> 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
>
> 在 S 上反复执行重复项删除操作，直到无法继续删除。
>
> 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
>
> 解题思路1：遍历重复2个就删除
>
> [代码](OneDay18.java)

#### [9. 回文数](https://leetcode-cn.com/problems/palindrome-number/)

> 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
>
> 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
>
> 解题思路1：倒过来，看是否一样
>
> [代码](OneDay19.java)

#### [27. 移除元素](https://leetcode-cn.com/problems/remove-element/)

> 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
>
> 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
>
> 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
>
> 解题思路1：遍历，有，就放在最后
>
> [代码](OneDay20.java)

#### [35. 搜索插入位置](https://leetcode-cn.com/problems/search-insert-position/)

> 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
>
> 你可以假设数组中无重复元素。
>
> 解题思路1：二分法
>
> [代码](OneDay21.java)

#### [58. 最后一个单词的长度](https://leetcode-cn.com/problems/length-of-last-word/)

> 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
>
> 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
>
> 解题思路1：倒遍历
>
> [代码](OneDay22.java)

#### [100. 相同的树](https://leetcode-cn.com/problems/same-tree/)

> 给你两棵二叉树的根节点 `p` 和 `q` ，编写一个函数来检验这两棵树是否相同。
>
> 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
>
> 解题思路1：前序和中序遍历的顺序元素一致，才是相同树(任意两种遍历都可以)
>
> [代码](OneDay23.java)

#### [203. 移除链表元素](https://leetcode-cn.com/problems/remove-linked-list-elements/)

> 给你一个链表的头节点 `head` 和一个整数 `val` ，请你删除链表中所有满足 `Node.val == val` 的节点，并返回 **新的头节点** 。
>
> 解题思路1：快慢指针
>
> [代码](OneDay24.java)

#### [67. 二进制求和](https://leetcode-cn.com/problems/add-binary/)

> 给你两个二进制字符串，返回它们的和（用二进制表示）。
>
> 输入为 **非空** 字符串且只包含数字 `1` 和 `0`。
>
> - 每个字符串仅由字符 `'0'` 或 `'1'` 组成。
> - `1 <= a.length, b.length <= 10^4`
> - 字符串如果不是 `"0"` ，就都不含前导零。
>
> 解题思路1：由于太长了，所以不能直接转化，只能使用位运算，一点点算了
>
> [代码](OneDay26.java)

#### [83. 删除排序链表中的重复元素](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/)

> 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
>
> 解题思路1：快慢指针
>
> [代码](OneDay27.java)

#### [258. 各位相加](https://leetcode-cn.com/problems/add-digits/)

> 给定一个非负整数 `num`，反复将各个位上的数字相加，直到结果为一位数。
>
> 解题思路1：直接遍历
>
> [代码](OneDay28.java)
>
> 解题思路2：
>
> > - x < 9：x
> > - x % 9 == 0: 9
> > - 其他：x % 9 

#### [92. 反转链表 II](https://leetcode-cn.com/problems/reverse-linked-list-ii/)

> 反转从位置 *m* 到 *n* 的链表。请使用一趟扫描完成反转。
>
> **说明:**
> 1 ≤ *m* ≤ *n* ≤ 链表长度。
>
> 解题思路1：分情况进行反转(中间情况作为主要循环)，另外三种边界情况：注意最后的反转
>
> [代码](OneDay29.java)

#### [61. 旋转链表](https://leetcode-cn.com/problems/rotate-list/)

> 给定一个链表，旋转链表，将链表每个节点向右移动 *k* 个位置，其中 *k* 是非负数
>
> 解题思路1：通过遍历确定个数，再遍历查找旋转点就行了
>
> [代码](OneDay30.java)

#### [43. 字符串相乘](https://leetcode-cn.com/problems/multiply-strings/)

> 给定两个以字符串形式表示的非负整数 `num1` 和 `num2`，返回 `num1` 和 `num2` 的乘积，它们的乘积也表示为字符串形式
>
> num1 和 num2 的长度小于110。
> num1 和 num2 只包含数字 0-9。
> num1 和 num2 均不以零开头，除非是数字 0 本身。
> 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
>
> 解题思路1：模拟乘法(包含模拟加法)
>
> [代码](OneDay31.java)

#### [39. 组合总和](https://leetcode-cn.com/problems/combination-sum/)

> 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
>
> candidates 中的数字可以无限制重复被选取。
>
> 说明：
>
> 所有数字（包括 target）都是正整数。
> 解集不能包含重复的组合
>
> 解题思路1：回溯法
>
> [代码](OneDay32.java)

#### [1603. 设计停车系统](https://leetcode-cn.com/problems/design-parking-system/)

> 
> 请你给一个停车场设计一个停车系统。停车场总共有三种不同大小的车位：大，中和小，每种尺寸分别有固定数目的车位。
>
> 请你实现 `ParkingSystem` 类：
>
> - `ParkingSystem(int big, int medium, int small)` 初始化 `ParkingSystem` 类，三个参数分别对应每种停车位的数目。
> - `bool addCar(int carType)` 检查是否有 `carType` 对应的停车位。 `carType` 有三种类型：大，中，小，分别用数字 `1`， `2` 和 `3` 表示。**一辆车只能停在** `carType` 对应尺寸的停车位中。如果没有空车位，请返回 `false` ，否则将该车停入车位并返回 `true` 。
>
> 解题思路1：直接用三个变量表示车位数就行了
>
> [代码](OneDay33.java)

#### [279. 完全平方数](https://leetcode-cn.com/problems/perfect-squares/)

> 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
>
> 给你一个整数 n ，返回和为 n 的完全平方数的 最少数量 。
>
> 完全平方数 是一个整数，其值等于另一个整数的平方；换句话说，其值等于一个整数自乘的积。例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。
>
> 解题思路1：已证明: 如果n % 8 == 7时，一个整数等于四个整数的平方和
>
> [代码](OneDay34.java)

#### [150. 逆波兰表达式求值](https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/)

> 根据 逆波兰表示法，求表达式的值。
>
> 有效的算符包括 +、-、*、/ 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。 
>
> 说明：
>
> 整数除法只保留整数部分。
> 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
>
> 解题思路1：堆栈
>
> [代码](OneDay35.java)

#### [138. 复制带随机指针的链表](https://leetcode-cn.com/problems/copy-list-with-random-pointer/)

> 给你一个长度为 n 的链表，每个节点包含一个额外增加的随机指针 random ，该指针可以指向链表中的任何节点或空节点。
>
> 构造这个链表的 深拷贝。 深拷贝应该正好由 n 个 全新 节点组成，其中每个新节点的值都设为其对应的原节点的值。新节点的 next 指针和 random 指针也都应指向复制链表中的新节点，并使原链表和复制链表中的这些指针能够表示相同的链表状态。复制链表中的指针都不应指向原链表中的节点 。
>
> 例如，如果原链表中有 X 和 Y 两个节点，其中 X.random --> Y 。那么在复制链表中对应的两个节点 x 和 y ，同样有 x.random --> y 。
>
> 返回复制链表的头节点。
>
> 用一个由 n 个节点组成的链表来表示输入/输出中的链表。每个节点用一个 [val, random_index] 表示：
>
> val：一个表示 Node.val 的整数。
> random_index：随机指针指向的节点索引（范围从 0 到 n-1）；如果不指向任何节点，则为  null 。
> 你的代码 只 接受原链表的头节点 head 作为传入参数。
>
> 解题思路1：直接复制，记录位置，再直接复制
>
> [代码](OneDay36.java)

#### [143. 重排链表](https://leetcode-cn.com/problems/reorder-list/)

> 给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
> 将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…
>
> 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
>
> 解题思路1：反转列表，同时统计个数，求出中点，并且确认个数的奇偶；然后用线性列表存储中点个数的节点，再反转列表回来；之后重组列表；两次反转N*2 + 重组N + 1，总的来书是O(N)；空间复杂度为O(N>>1)
>
> [代码](OneDay37.java)

#### [107. 二叉树的层序遍历 II](https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/)

> 给定一个二叉树，返回其节点值自底向上的层序遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
>
> 例如：
> 给定二叉树 [3,9,20,null,null,15,7],
>
> 解题思路1：正常层序遍历，再倒排
>
> [代码](OneDay38.java)

#### [293. 翻转游戏](https://leetcode-cn.com/problems/flip-game/)

> 你和朋友玩一个叫做「翻转游戏」的游戏。游戏规则如下：
>
> 给你一个字符串 currentState ，其中只含 '+' 和 '-' 。你和朋友轮流将 连续 的两个 "++" 反转成 "--" 。当一方无法进行有效的翻转时便意味着游戏结束，则另一方获胜。
>
> 计算并返回 一次有效操作 后，字符串 currentState 所有的可能状态，返回结果可以按 任意顺序 排列。如果不存在可能的有效操作，请返回一个空列表 [] 。
>
>  解题思路1：遍历
>
> [代码](OneDay40.java)

#### [228. 汇总区间](https://leetcode-cn.com/problems/summary-ranges/)

> 给定一个无重复元素的有序整数数组 nums 。
>
> 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
>
> 列表中的每个区间范围 [a,b] 应该按如下格式输出：
>
> "a->b" ，如果 a != b
> "a" ，如果 a == b
>
> 解题思路1：遍历
>
> [代码](OneDay41.java)

#### [392. 判断子序列](https://leetcode-cn.com/problems/is-subsequence/)

> 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
>
> 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
>
> 进阶：
>
> 如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
>
> 解题思路1：遍历比较
>
> [代码](OneDay42.java)

#### [374. 猜数字大小](https://leetcode-cn.com/problems/guess-number-higher-or-lower/)

> 猜数字游戏的规则如下：
>
> 每轮游戏，我都会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。
> 如果你猜错了，我会告诉你，你猜测的数字比我选出的数字是大了还是小了。
> 你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，返回值一共有 3 种可能的情况（-1，1 或 0）：
>
> -1：我选出的数字比你猜的数字小 pick < num
> 1：我选出的数字比你猜的数字大 pick > num
> 0：我选出的数字和你猜的数字一样。恭喜！你猜对了！pick == num
> 返回我选出的数字。
>
> 解题思路1：二分法：注意int溢出，用long
>
> [OneDay43.java]

#### [394. 字符串解码](https://leetcode-cn.com/problems/decode-string/)

> 给定一个经过编码的字符串，返回它解码后的字符串。
>
> 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
>
> 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
>
> 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入、
>
> 解题思路1：借助堆栈，但是扩展的字符串需要重复推进到堆栈中(以后可以优化)
>
> [代码](OneDay44.java)