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

#### [448. 找到所有数组中消失的数字](https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/)

> 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
>
> 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
>
> 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
>
> 解题思路1：遍历一次，把当前值的绝对值作为下标，变为负数；在遍历一次，不是负数的下标加1就是缺失的；时间复杂度为O(2N) 空间复杂度为1，但是只有空间超越86；时间复杂度只超过25%
>
> [DoubleSix04.java](DoubleSix04.java)

#### [441. 排列硬币](https://leetcode-cn.com/problems/arranging-coins/)

> 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
>
> 给定一个数字 n，找出可形成完整阶梯行的总行数。
>
> n 是一个非负整数，并且在32位有符号整型的范围内。
>
> 解题思路1：二分法，时间100%和空间80%
>
> [DoubleSix05](DoubleSix05.java)

#### [1006. 笨阶乘](https://leetcode-cn.com/problems/clumsy-factorial/)

> 通常，正整数 n 的阶乘是所有小于或等于 n 的正整数的乘积。例如，factorial(10) = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1。
>
> 相反，我们设计了一个笨阶乘 clumsy：在整数的递减序列中，我们以一个固定顺序的操作符序列来依次替换原有的乘法操作符：乘法(*)，除法(/)，加法(+)和减法(-)。
>
> 例如，clumsy(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1。然而，这些运算仍然使用通常的算术运算顺序：我们在任何加、减步骤之前执行所有的乘法和除法步骤，并且按从左到右处理乘法和除法步骤。
>
> 另外，我们使用的除法是地板除法（floor division），所以 10 * 9 / 8 等于 11。这保证结果是一个整数。
>
> 实现上面定义的笨函数：给定一个整数 N，它返回 N 的笨阶乘。
>
> 解题思路1：处理小于4的；再处理第一个，接着处理隔4个的，最后处理求余的
>
> [DoubleSix06.java](DoubleSix06.java)

#### [面试题 17.21. 直方图的水量](https://leetcode-cn.com/problems/volume-of-histogram-lcci/)

> 给定一个直方图(也称柱状图)，假设有人从上面源源不断地倒水，最后直方图能存多少水量?直方图的宽度为 1。
>
> 解题思路1：一行一行来统计，时间复杂度为N + max * 2N，空间复杂度为O(1)；但是时间复杂度只超越5%，空间复杂度只超越53.62%，所以不是最优算法，考虑为第一次做困难题，允许不60%吧
>
> [DoubleSix07.java](DoubleSix07.java)

#### [31. 下一个排列](https://leetcode-cn.com/problems/next-permutation/)

> 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
>
> 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
>
> 必须 原地 修改，只允许使用额外常数空间。
>
> 解题思路1：
>
> > 1. 找出最大索引nums[i] < nums[i + 1]，如果不存在，就返回反转列表
> > 2. 如果存在，再找出nums[j] > nums[i]的最大索引
> > 3. 交换nums[i] 和nums[j]
> > 4. 再反转[i + 1，nums.length -1]的内容
>
> [DoubleSix08.java](DoubleSix08.java)
>
> 总结：我觉得我需要复习一下数学内容了。。。。。。。。。。。

#### [290. 单词规律](https://leetcode-cn.com/problems/word-pattern/)

> 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
>
> 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
>
> 解题思路1：遍历，借助hashMap，分别比对pattern和str的元素
>
> [DoubleSix09.java](DoubleSix09.java)

#### [142. 环形链表 II](https://leetcode-cn.com/problems/linked-list-cycle-ii/)

> 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
>
> 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。
>
> 说明：不允许修改给定的链表。
>
> 进阶：
>
> 你是否可以使用 O(1) 空间解决此题？
>
> - 链表中节点的数目范围在范围 `[0, 104]` 内
> - `-105 <= Node.val <= 105`
> - `pos` 的值为 `-1` 或者链表中的一个有效索引
>
> 解题思路1：借助node.val的范围，每个节点+200001，当超过100000就是结果，最后再给它复位就行了，空间复杂度O(1)，时间复杂度O(2N)
>
> [DoubleSix10.java](DoubleSix10.java)

#### [80. 删除有序数组中的重复项 II](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/)

> 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 最多出现两次 ，返回删除后数组的新长度。
>
> 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成
>
> 解题思路1：遍历，标志位判断出现两次；不同直接赋值，时间复杂度O(N)，空间复杂度O(1)
>
> [DoubleSix11.java](DoubleSix11.java)

#### [6. Z 字形变换](https://leetcode-cn.com/problems/zigzag-conversion/)

> 将一个给定字符串 `s` 根据给定的行数 `numRows` ，以从上往下、从左到右进行 Z 字形排列。
>
> 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串
>
> 解题思路1：找规律，定一行和最后一行都是相隔(numRows - 1) << 1，而中间的就是第一行的索引，减去当前行的上一个值的索引
>
> [DoubleSix12.java](DoubleSix12.java)

#### [225. 用队列实现栈](https://leetcode-cn.com/problems/implement-stack-using-queues/)

> 请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通队列的全部四种操作（push、top、pop 和 empty）。
>
> 实现 MyStack 类：
>
> void push(int x) 将元素 x 压入栈顶。
> int pop() 移除并返回栈顶元素。
> int top() 返回栈顶元素。
> boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。
>
>
> 注意：
>
> 你只能使用队列的基本操作 —— 也就是 push to back、peek/pop from front、size 和 is empty 这些操作。
> 你所使用的语言也许不支持队列。 你可以使用 list （列表）或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
>
> 解题思路1：连个队列，左右倒水：弹出值，那个队列有值，就弹出
>
> [DoubleSix13.java](DoubleSix13.java)

#### [153. 寻找旋转排序数组中的最小值](https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array/)

> 已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 旋转 后，得到输入数组。例如，原数组 nums = [0,1,2,4,5,6,7] 在变化后可能得到：
> 若旋转 4 次，则可以得到 [4,5,6,7,0,1,2]
> 若旋转 7 次，则可以得到 [0,1,2,4,5,6,7]
> 注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。
>
> 给你一个元素值 互不相同 的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。
>
> n == nums.length
> 1 <= n <= 5000
> -5000 <= nums[i] <= 5000
> nums 中的所有整数 互不相同
> nums 原来是一个升序排序的数组，并进行了 1 至 n 次旋转
>
> 解题思路1：遍历找相邻不是递增，如果遍历到最后，就返回第一个；若不是，返回遍历位置的，就是题目有点奇怪，没有特殊要求，还是中等题
>
> [DoubleSix14.java](DoubleSix14.java)

#### [263. 丑数](https://leetcode-cn.com/problems/ugly-number/)

> 给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
>
> 丑数 就是只包含质因数 2、3 和/或 5 的正整数。
>
> 解题思路1：主要是>=1的整数：不断求余2/3/5，==0，就除于对应的数，直到等于1为止
>
> [DoubleSix15.java](DoubleSix15.java)

#### [541. 反转字符串 II](https://leetcode-cn.com/problems/reverse-string-ii/)

> 给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。
>
> 如果剩余字符少于 k 个，则将剩余字符全部反转。
> 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样
>
> 解题思路1：注意边界调节就行了
>
> [DoubleSix16.java](DoubleSix16.java)

#### [147. 对链表进行插入排序](https://leetcode-cn.com/problems/insertion-sort-list/)

> 插入排序算法：
>
> 插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
> 每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
> 重复直到所有输入数据插入完为止。
>
> 解题思路1：分清头插入和中间插入，尾插入直接跳过
>
> [DoubleSix17.java](DoubleSix17.java)