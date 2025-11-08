class Solution {
    public String longestCommonPrefix(String[] strs) {
        int count = strs.length;
        if (strs == null || count == 0) return "";
        String currentPrefix = strs[0];

        for (int j = 0; j < count; j++){
            while (!strs[j].startsWith(currentPrefix)){
                currentPrefix = currentPrefix.substring(0, currentPrefix.length() -1);
                if (currentPrefix.equals("")) return "";
            }
        }
        return currentPrefix;
    }
}