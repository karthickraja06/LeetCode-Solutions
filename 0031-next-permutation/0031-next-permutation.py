class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        def reverse(arr,s,e):
            for i in range(s,(s+e+1)//2):
                arr[i],arr[e+s-i] = arr[e+s-i],arr[i]

        ind,n = -1,len(nums)
        for i in range(n-2,-1,-1):
            if(nums[i] < nums[i+1]):
                ind = i
                break
        if(ind == -1):
            reverse(nums,0,n-1)
        else:
            for i in range(n - 1,ind,-1):
                print(i)
                if(nums[i] > nums[ind]):
                    nums[ind],nums[i] = nums[i],nums[ind]
                    reverse(nums,ind+1,n-1)
                    break
        