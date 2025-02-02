class Pair{
    char ele;
    int cnt;
    Pair(char e,int c){
        this.ele = e;
        this.cnt = c;
    }
}
class Solution {
    public String frequencySort(String s) {
        // Finding the frequency of character using hashmap
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char i:s.toCharArray()){
            freq.put(i,freq.getOrDefault(i,0) + 1);
        }

        // Since hashmap cannot be sorted converting to list of Objects
        List<Pair> freqArr = new ArrayList<>();
        for(Character i: freq.keySet()){
            freqArr.add(new Pair(i,freq.get(i)));
        }

        // Sorting the list of object using custom comparator
        Collections.sort(freqArr,(a,b)->{
            if(a.cnt == b.cnt){
                return Character.compare(a.ele, b.ele);

            }
            return Integer.compare(a.cnt,b.cnt);
        });

        // Forming the final word using the sorted list
        StringBuilder res = new StringBuilder();
        for(int i = freqArr.size() - 1;i >= 0;i--){
            char k = freqArr.get(i).ele;
            for(int j = 0;j < freqArr.get(i).cnt;j++){
                res.append(k);
            }
        }
        return res.toString();
    }
}