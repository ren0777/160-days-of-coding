// Last updated: 7/15/2026, 12:54:21 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
4        Deque<Integer> stack = new ArrayDeque<>();
5
6        for (int num : nums2) {
7            while (!stack.isEmpty() && stack.peek() < num) {
8                nextGreaterMap.put(stack.pop(), num);
9            }
10            stack.push(num);
11        }
12
13        while (!stack.isEmpty()) {
14            nextGreaterMap.put(stack.pop(), -1);
15        }
16
17        int[] result = new int[nums1.length];
18        for (int i = 0; i < nums1.length; i++) {
19            result[i] = nextGreaterMap.get(nums1[i]);
20        }
21        return result;
22    }
23}