// Number 1
// I could have done this in 20 minutes or less but i forgot the syntax for Java.
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sumArray;
        for(int x = 0; x < nums.length; x++){
            for(int y = x+1; y < nums.length; y++){
                if(nums[x] + nums[y] == target){
                    return new int[] {x,y};
                }

            }
        }
        throw new IllegalArgumentException("no two sums solution");
    }
}

// Number 2
// Given a 32-bit signed integer, reverse digits of an integer.
// I DONT Understand how they got this answer bruh.

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}