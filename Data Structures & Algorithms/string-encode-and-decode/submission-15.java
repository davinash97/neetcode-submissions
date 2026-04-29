class Solution {

    public String encode(List<String> strs) {
        char ch = '~'; // Special Character for Encoding
        StringBuilder newStr = new StringBuilder();
        for(String str: strs) {
            newStr.append(str + ch);
        }
        return newStr.toString();
    }

    public List<String> decode(String str) {
        char ch = '~'; // Same Special Character for Decoding
        List<String> newList = new ArrayList<>();
        StringBuilder newStr = new StringBuilder();
        for(char i: str.toCharArray()) {
            if(i == ch){
                newList.add(newStr.toString());
                newStr.setLength(0);
                continue;
            }
            newStr.append(i);
        }
        return newList;
    }
}
