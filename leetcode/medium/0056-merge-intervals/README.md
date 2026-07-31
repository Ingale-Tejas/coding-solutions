# Merge Intervals

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of `intervals` where `intervals[i] = [starti, endi]`, merge all overlapping intervals, and return  *an array of the non-overlapping intervals that cover all the intervals in the input*.

 

 **Example 1:** 

```
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

```

 **Example 2:** 

```
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

```

 **Example 3:** 

```
Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
Explanation: Intervals [1,4] and [4,7] are considered overlapping.

```

 

 **Constraints:** 

- 1 <= intervals.length <= 104
- intervals[i].length == 2
- 0 <= starti <= endi <= 104

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 91.49%)  
**Memory:** 48.9 MB (beats 75.70%)  
**Submitted:** 2026-07-31T12:41:05.282Z  

```java
class Solution {
    public int[][] merge(int[][] intervals) {
        
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

            List <int[] > result = new ArrayList<>();
        
                for(int[] interval : intervals)
                {
                    if(result.isEmpty() || result.get(result.size() -1)[1] < interval[0]) {
                        result.add(interval);

                    }
                    else {
                        result.get(result.size()-1)[1]= 
                        Math.max(result.get(result.size()-1) [1], interval[1]);
                    }
                }
       return  result.toArray(new int[result.size()][]);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/merge-intervals/)