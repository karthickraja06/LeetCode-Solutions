class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(n < 4){
            return res;
        }
        Arrays.sort(nums);

        for(int i = 0;i < nums.length;i++){
            if(i != 0 && nums[i] == nums[i-1])continue;

            for(int j = i+1; j < nums.length;j++){
                if(j > i + 1 && nums[j] == nums[j-1])continue;

                int a = j+1,b = n - 1;
                while(a < b){
                    long sum = nums[i];
                    sum += nums[j]; 
                    sum += nums[a];
                    sum += nums[b];
                    if(sum == target){
                        List<Integer> sub = Arrays.asList(nums[i],nums[j],nums[a],nums[b]);
                        res.add(sub);
                        a++;b--;
                        while (a < b && nums[a] == nums[a - 1]) a++;
                        while (a < b && nums[b] == nums[b + 1]) b--;
                    }
                    else if(sum > target){
                        b--;
                    }else{
                        a++;
                    }
                }
            }
        }
        return res;
    }
}