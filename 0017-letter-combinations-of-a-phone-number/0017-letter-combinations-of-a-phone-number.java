class Solution {
    public void solve(List<String> ans, StringBuilder temp, Map<Character, String> mpp, String digits, int idx) {
        if (idx == digits.length()) {
            ans.add(temp.toString());
            return;
        }

        char ch = digits.charAt(idx);
        String str = mpp.get(ch);

        for (char c : str.toCharArray()) {
            temp.append(c);
            solve(ans, temp, mpp, digits, idx + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();

        Map<Character, String> mpp = new HashMap<>();
        mpp.put('2', "abc");
        mpp.put('3', "def");
        mpp.put('4', "ghi");
        mpp.put('5', "jkl");
        mpp.put('6', "mno");
        mpp.put('7', "pqrs");
        mpp.put('8', "tuv");
        mpp.put('9', "wxyz");

        List<String> ans = new ArrayList<>();
        solve(ans, new StringBuilder(), mpp, digits, 0);
        return ans;
    }
}