class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) return false; // Odd length cannot be valid.

        int openCount = 0, balance = 0;

        // Left-to-right traversal
        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '1') {
                if (s.charAt(i) == '(') openCount++;
                else openCount--;
            } else {
                openCount++; // Treat unlocked as '('
            }
            balance++;
            if (openCount < 0) return false; // Too many ')'
        }

        // Reset for right-to-left traversal
        openCount = 0;
        balance = 0;

        // Right-to-left traversal
        for (int i = s.length() - 1; i >= 0; i--) {
            if (locked.charAt(i) == '1') {
                if (s.charAt(i) == ')') openCount++;
                else openCount--;
            } else {
                openCount++; // Treat unlocked as ')'
            }
            balance++;
            if (openCount < 0) return false; // Too many '('
        }

        return true;
    }
}
