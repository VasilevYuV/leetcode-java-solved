class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];

        for (int j = 1; j < strs.length; j++){
            while (!strs[j].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.equals("")) return "";
            }
        }
        return prefix;
    }
}