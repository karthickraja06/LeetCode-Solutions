class Solution {
    public boolean possible(int[] arr,int cur,int m,int k){
        int cntOB = 0,cnt = 0;
        for(int i: arr){
            if(i <= cur) cnt++;
            else{
                cntOB += cnt/k;
                if(cntOB >= m)return true;
                cnt = 0;
            }
        }
        cntOB += cnt/k;
        return (cntOB >= m)?true:false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long)m * k > n)return -1;
        int l = Integer.MAX_VALUE,h = -1;
        for(int i:bloomDay){
            l = Math.min(i,l);
            h = Math.max(i,h);
        }
        while(l <= h){
            int mid = (l + h) / 2;
            if(possible(bloomDay,mid,m,k)){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}