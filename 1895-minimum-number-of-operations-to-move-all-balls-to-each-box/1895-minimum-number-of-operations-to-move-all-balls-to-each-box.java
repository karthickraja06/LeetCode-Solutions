class Solution {
    public int[] minOperations(String boxes) {
        ArrayList<Integer> pre = new ArrayList<>();
        for(int i = 0;i < boxes.length();i++){
            if(boxes.charAt(i) == '1'){
                pre.add(i);
            }
        }
        int[] res = new int[boxes.length()];
        for(int i = 0;i < boxes.length();i++){
            int sub = 0;
            for(int j = 0;j < pre.size();j++){
                if(pre.get(j) != i){
                    sub += Math.abs(i - pre.get(j));
                }
            }
            res[i] = sub;
        }
        return res;
    }
}