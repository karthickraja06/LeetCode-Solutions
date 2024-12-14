class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gp = 0,sp = 0;
        while(gp < g.length && sp < s.length){
            if(g[gp] <= s[sp]){
                gp++;sp++;
            }else sp++;
        }
        return gp;
    }
}