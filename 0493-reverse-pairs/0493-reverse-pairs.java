class Solution {
    public int merge(int[] a,int l,int m,int h){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l,right = m+1,cnt = 0;
        while(left <= m && right <= h){
            if(a[left] > 2L * a[right]){
                cnt += m - left + 1;
                right++;
            }else{
                left++;
            }
        }
        left = l;right = m+1;
        while(left <= m && right <= h){
            if(a[left] > a[right]){
                temp.add(a[right++]);
            }else{
                temp.add(a[left++]);
            }
        }
        while(left <= m){
            temp.add(a[left++]);
        }
        while(right <= h){
            temp.add(a[right++]);
        }
        for(int i = l;i <=h;i++){
            a[i] = temp.get(i-l);
        }
        return cnt; 
    }

    public int mergeSort(int[] a,int l,int h){
        int cnt = 0;
        if(l>=h) 
        return cnt;
        int mid = (l+h)/2;
        cnt += mergeSort(a,l,mid);
        cnt += mergeSort(a,mid+1,h);
        cnt += merge(a,l,mid,h);
        return cnt;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }
}