class Solution {
    public String longestCommonPrefix(String[] strs) {
        String currentPrefix = "";
        String finalPrefix = "";
        long count = Arrays.stream(strs).count();

        for (int i = 0; i < strs[0].length(); i++){
            currentPrefix += strs[0].toCharArray()[i];
            for (int j = 0; j < count; j++){
                if (!strs[j].startsWith(currentPrefix)){
                    if (currentPrefix.length() > 1){
                        finalPrefix = currentPrefix.substring(0, currentPrefix.length() - 1);
                    }
                    currentPrefix = "";
                    return finalPrefix;
                }
            }
        }
        if (finalPrefix.isEmpty()){
            finalPrefix = currentPrefix;
        }
        return finalPrefix;
    }
}