// LeetCode 167: Two Sum II - Input Array Is Sorted
// Approach:-
// Use the Two-Pointer technique
// Start one pointer from the beginning(left) and the other from the end(right)
// If the sum is greater than the target value then move/decrement the right pointer
// If the sum is smaller than the target value then move/increment the left pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }
            if (sum > target)
                right--;
            if (sum < target)
                left++;
        }
        return new int[]{-1, -1};
    }
}
