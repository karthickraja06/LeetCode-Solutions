class Solution {
    public boolean in(char s){
        char[] v = {'a','e','i','o','u'};
        for(char i: v){
            if(i == s)return true;
        }
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = queries.length;
        List<Integer> prefix = new ArrayList<>();
        int cnt = 0;
        prefix.add(cnt);
        for(String i: words){
            char st = i.charAt(0);
            char end = i.charAt(i.length() - 1);
            if(in(st) && in(end)){
                cnt++;
            }
            prefix.add(cnt);
        }
        int j = 0;
        int[] res = new int[n];
        for(int[] i : queries){
            if(i[0] != i[1]){
                res[j++] = prefix.get(i[1] + 1) - prefix.get(i[0]);
            }else{
                if(prefix.get(i[0]+1) == prefix.get(i[0]))
                res[j++] = 0;
                else
                res[j++] = 1;
            }
        }
        return res;
    }
}