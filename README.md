# May-Leetcoding-Challenge
[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://github.com/sagnik20/may-leetcoding-challenge/graphs/commit-activity) [![Ask Me Anything !](https://img.shields.io/badge/Ask%20me-anything-1abc9c.svg)](https://GitHub.com/sagnik20/ama) [![made-for-VSCode](https://img.shields.io/badge/Made%20for-LeetCode-1f425f.svg)](https://leetcode.com/) [![GitHub issues](https://img.shields.io/github/issues/sagnik20/may-leetcoding-challenge)](https://github.com/sagnik20/may-leetcoding-challenge/issues)
[![GitHub forks](https://img.shields.io/github/forks/sagnik20/may-leetcoding-challenge?style=social)](https://github.com/sagnik20/may-leetcoding-challenge/network) [![GitHub stars](https://img.shields.io/github/stars/sagnik20/may-leetcoding-challenge?style=social)](https://github.com/sagnik20/may-leetcoding-challenge/stargazers) [![Open Source Love svg1](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)

I have started from May 8th in this Challenge. And this repository contains my solutions to the challenge. Only the `exact solution`. If you want to improve the solutions, Please make a `Issue first`.

### Questions : 
#### Day-8 : 
**Check If It Is a Straight Line :** 
>You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

**Example :**

`Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]`
`Output: true`

`Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]`
`Output: false`

**Constraints :**
+ `2 <= coordinates.length <= 1000`
+ `coordinates[i].length == 2`
+ `-10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4`
+ coordinates contains no duplicate point.

***

#### Day-9 : 
**Valid Perfect Square :** 
>Given a positive integer num, write a function which returns True if num is a perfect square else False.

>Note: Do not use any built-in library function such as `sqrt`.

**Example :**

`Input: 16`
`Output: true`

`Input: 14`
`Output: false`

***

#### Day-10 : 
**Find the Town Judge :** 
>In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.

>If the town judge exists, then:
1.The town judge trusts nobody.
2.Everybody (except for the town judge) trusts the town judge.
3.There is exactly one person that satisfies properties 1 and 2.
4.You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.

>If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.

**Example :**

`Input: N = 2, trust = [[1,2]]`
`Output: 2`

`Input: N = 3, trust = [[1,3],[2,3]]`
`Output: 3`

`Input: N = 3, trust = [[1,3],[2,3],[3,1]]`
`Output: -1`

`Input: N = 3, trust = [[1,2],[2,3]]`
`Output: -1`

`Input: N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]`
`Output: 3`

**Constraints :**
+ `1 <= N <= 1000`
+ `trust.length <= 10000`
+ `trust[i]` are all different
+ `trust[i][0] != trust[i][1]`
+ `1 <= trust[i][0], trust[i][1] <= N`

***

#### Day-11 : 
**Flood Fill :** 
>An `image` is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).

>Given a coordinate `(sr, sc)` representing the starting pixel (row and column) of the flood fill, and a pixel value `newColor`, "flood fill" the image.

>To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

>At the end, return the modified image.

**Example :**

`Input: 
image = [[1,1,1],[1,1,0],[1,0,1]]
sr = 1, sc = 1, newColor = 2`
`Output: 
[[2,2,2],[2,2,0],[2,0,1]]`
`Explanation: 
From the center of the image (with position (sr, sc) = (1, 1)), all pixels connected 
by a path of the same color as the starting pixel are colored with the new color.
Note the bottom corner is not colored 2, because it is not 4-directionally connected
to the starting pixel.`


**Constraints :**
+ The length of `image` and `image[0]` will be in the range `[1, 50]`.
+ The given starting pixel will satisfy `0 <= sr < image.length and 0 <= sc < image[0].length`.
+ The value of each color in `image[i][j]` and `newColor` will be an integer in `[0, 65535]`.
***

#### Day-12 : 
**Check If It Is a Straight Line :** 
>You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once. Find this single element that appears only once.

**Example :**

`Input: [1,1,2,3,3,4,4,8,8]`
`Output: 2`

`Input: [3,3,7,7,10,11,11]`
`Output: 10`

**Constraints :**
+  Your solution should run in `O(log n) time` and `O(1) space`.

***

#### Day-13 : 
**Remove K smallest :** 
>Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

**Example :**

`Input: num = "1432219", k = 3`
`Output: "1219"`
`Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.`

`Input: num = "10200", k = 1`
`Output: "200"`
`Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.`

`Input: num = "10", k = 2`
`Output: "0"`
`Explanation: Remove all the digits from the number and it is left with nothing which is 0.`

**Constraints :**
+ The length of `num is less than 10002` and will be `≥ k`.
+ The given num does not contain any leading zero.

***

#### Day-14 : 
**Implement Trie (Prefix Tree) :** 
>Implement a trie with `insert`, `search`, and `startsWith` methods.

**Example :**

`Trie trie = new Trie();`

`trie.insert("apple");`

`trie.search("apple");   // returns true`

`trie.search("app");     // returns false`

`trie.startsWith("app"); // returns true`

`trie.insert("app");   `

`trie.search("app");     // returns true`

**Constraints :**
+ You may assume that all inputs are consist of lowercase letters `a-z`. 
+ All inputs are guaranteed to be non-empty strings.

Help : https://medium.com/@saurav.agg19/implement-trie-prefix-tree-692560ea448a

***

#### Day-15 : 
**Maximum Sum Circular Subarray :** 
>Given a circular array C of integers represented by `A`, find the maximum possible sum of a non-empty subarray of C.

>Here, a circular array means the end of the array connects to the beginning of the array.  (Formally, `C[i] = A[i]` when `0 <= i < A.length`, and `C[i+A.length] = C[i]` when `i >= 0`.)

>Also, a subarray may only include each element of the fixed buffer A at most once.  (Formally, for a subarray `C[i], C[i+1], ..., C[j],` there does not exist `i <= k1, k2 <= j` with `k1 % A.length = k2 % A.length`.)

**Examples :**

`Input: [1,-2,3,-2]`
`Output: 3`
`Explanation: Subarray [3] has maximum sum 3`

`Input: [5,-3,5]`
`Output: 10`
`Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10`

`Input: [-2,-3,-1]`
`Output: -1`
`Explanation: Subarray [-1] has maximum sum -1`

`Input: [3,-2,2,-3]`
`Output: 3`
`Explanation: Subarray [3] and [3,-2,2] both have maximum sum 3`

`Input: [3,-1,2,-1]`
`Output: 4`
`Explanation: Subarray [2,-1,3] has maximum sum 2 + (-1) + 3 = 4`


**Constraints :**
+ `-30000 <= A[i] <= 30000`
+ `1 <= A.length <= 30000`

***
