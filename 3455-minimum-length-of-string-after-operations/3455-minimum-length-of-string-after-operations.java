class Solution {
    public int minimumLength(String s) {
        int n = s.length(),res = n;
        if(n < 3)return n;
        HashMap<Character,ArrayList<Integer>> prefix = new HashMap<>();
        for(int i = 0;i < n;i++){
            char j = s.charAt(i);
            if (!prefix.containsKey(j)) {
                prefix.put(j, new ArrayList<>());
            }
            prefix.get(j).add(i);
            if(prefix.get(j).size() >= 3){
                res -= 2;
                prefix.get(j).remove(0);
                prefix.get(j).remove(1);
            }
        }
        return res;
    }
}