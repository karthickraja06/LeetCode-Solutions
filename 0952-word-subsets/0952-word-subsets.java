class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> res = new ArrayList<>();
        //combining all the words2 to get the overall words
        int[] maxOccurence = new int[26];
        for(String i: words2){
            int[] subOccurence = new int[26];
            for(char j:i.toCharArray()){
                int ind = j - 'a';
                subOccurence[ind]++;
                maxOccurence[ind] = Math.max(maxOccurence[ind],subOccurence[ind]);
            }
        }

        StringBuilder all = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char j = (char) ('a' + i);
            for (int k = 0; k < maxOccurence[i]; k++) {
                all.append(j);
            }
        }
        String result = all.toString();
        System.out.println(result);

        int n = all.length();

        //iterating to find the universal words
        for(String i:words1){
            int m = i.length();
            if(m < n)continue;

            char[] charArr = i.toCharArray();
            Arrays.sort(charArr);
            int a = 0,b = 0;
            boolean isUniversal = true;
            while(a < n && b < m){
                if(all.charAt(a) == charArr[b]){
                    a++;b++;
                }else if(all.charAt(a) > charArr[b]){
                    b++;
                }else{
                    isUniversal = false;
                    break;
                }
            }
            if(isUniversal && a >= n)res.add(i);
        }
        return res;
    }
}
