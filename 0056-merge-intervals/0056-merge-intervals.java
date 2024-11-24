class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            int cmp = Integer.compare(a[0],b[0]);
            if(cmp != 0)
                return cmp;
            return Integer.compare(a[1],b[1]);
            
        });
        ArrayList<int[]> res = new ArrayList<>();
        int start = intervals[0][0], end = intervals[0][1];
        for(int i=1;i < intervals.length;i++){
            if(intervals[i][0] <= end){
                end = Math.max(end,intervals[i][1]);
            }else {
                res.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res.add(new int[]{start,end});
        
        return res.toArray(new int[res.size()][]);
        
    }
}