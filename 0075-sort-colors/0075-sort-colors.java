class Solution {
    public void sortColors(int[] nums) {
        int[] countArr = new int[3];
        for(int i : nums){
            countArr[i] += 1;
        }
        countArr[1] += countArr[0];
        countArr[2] += countArr[1];
        int j = 0;
        for(int i = 0;i < 3; i++){
            while(j < countArr[i]){
                nums[j++] = i;
            }
        } 

    }
}