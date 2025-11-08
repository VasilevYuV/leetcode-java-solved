class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> vocabulary = new LinkedHashMap<>();
        vocabulary.put(1000, "M");
        vocabulary.put(900, "CM");
        vocabulary.put(500, "D");
        vocabulary.put(400, "CD");
        vocabulary.put(100, "C");
        vocabulary.put(90, "XC");
        vocabulary.put(50, "L");
        vocabulary.put(40, "XL");
        vocabulary.put(10, "X");
        vocabulary.put(9, "IX");
        vocabulary.put(5, "V");
        vocabulary.put(4, "IV");
        vocabulary.put(1, "I");

        StringBuilder romanValue = new StringBuilder();

        for (int i : vocabulary.keySet()){
            if (num == 0){
                break;
            }
            while (num >= i){
                romanValue.append(vocabulary.get(i));
                num -= i;
            }
        }

        return romanValue.toString();
    }
}