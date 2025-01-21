class Solution {
    public boolean isIsomorphic(String s, String t) {
        ArrayList<Integer> map1 = new ArrayList<>();
        ArrayList<Integer> map2 = new ArrayList<>();
        for(char i:s.toCharArray()){
            map1.add(s.indexOf(i));
        }
        for(char i:t.toCharArray()){
            map2.add(t.indexOf(i));
        }
        return map1.equals(map2);
        
    }
}