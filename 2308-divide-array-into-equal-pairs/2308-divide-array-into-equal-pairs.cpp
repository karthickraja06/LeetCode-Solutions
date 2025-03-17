class Solution {
public:
    bool divideArray(vector<int>& nums) {
        int xorSum = 0, cnt = 0, lastNum = nums[nums.size() - 1];

        for (int i : nums) {
            xorSum ^= i; // XOR all elements
            if (i == lastNum) cnt++; // Count occurrences of the last number
        }

        return (xorSum == 0 && cnt % 2 == 0);
    }
};