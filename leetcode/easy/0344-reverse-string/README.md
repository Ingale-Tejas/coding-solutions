# Reverse String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

 **Example 1:** 

```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

```

 **Example 2:** 

```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is a printable ascii character.

## Solution

**Language:** C  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 17.9 MB (beats 47.67%)  
**Submitted:** 2026-07-31T05:39:26.300Z  

```c
void reverseString(char* s, int sSize) {
    int start = 0;
    int end = sSize - 1;

    //swap
    while(start <= end) {
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        start = start + 1;
        end = end -1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)