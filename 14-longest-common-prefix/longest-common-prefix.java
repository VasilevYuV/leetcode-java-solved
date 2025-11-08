class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String currentPrefix = strs[0];

        for (int j = 0; j < strs.length; j++){
            while (!strs[j].startsWith(currentPrefix)){
                currentPrefix = currentPrefix.substring(0, currentPrefix.length() -1);
                if (currentPrefix.equals("")) return "";
            }
        }
        return currentPrefix;
    }
}