class Solution {
    public boolean isPossible(int[] ranks,int cars,long min){
        int cnt = 0;
        for(int i:ranks){
            cnt += (int) Math.sqrt(min / i);
            if(cnt >= cars)
                return true;
        }
        return false;
    }
    public long repairCars(int[] ranks, int cars) {
        int n = ranks.length;
        long l = Integer.MAX_VALUE,r = 0,c = (long) Math.pow(Math.ceil((double)cars/n),2);
        for(int i:ranks){
            l = Math.min(l,i);
            r = Math.max(r,i);
        }
        l = l * c;
        r = r * c;
        while(l <= r){
            long mid = (l + r) / 2;
            if(isPossible(ranks,cars,mid)){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}