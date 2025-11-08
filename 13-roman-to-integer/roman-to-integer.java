class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> vocabulary = new LinkedHashMap<>();
        vocabulary.put("M", 1000);
        vocabulary.put("CM", 900);
        vocabulary.put("D", 500);
        vocabulary.put("CD", 400);
        vocabulary.put("C", 100);
        vocabulary.put("XC", 90);
        vocabulary.put("L", 50);
        vocabulary.put("XL", 40);
        vocabulary.put("X", 10);
        vocabulary.put("IX", 9);
        vocabulary.put("V", 5);
        vocabulary.put("IV", 4);
        vocabulary.put("I", 1);

        int romanToInteger = 0;
        String[] symbols = s.split("");
        for (int i = 0; i < symbols.length; i++){
            if (i < symbols.length - 1 && vocabulary.get(symbols[i]) < vocabulary.get(symbols[i+1])){
                romanToInteger += vocabulary.get(symbols[i].concat(symbols[i+1]));
                i++;
            } else {
                romanToInteger += vocabulary.get(symbols[i]);
            }
        
        
        }
    
        return romanToInteger;
    }
}