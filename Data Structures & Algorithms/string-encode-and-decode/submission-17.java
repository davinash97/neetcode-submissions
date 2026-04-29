class Solution {

    protected char ch = '~'; // Special Character for Encoding

    public String encode(List<String> strs) {
        StringBuilder newStr = new StringBuilder();
        for(String str: strs) {
            newStr.append(str + ch);
        }
        return newStr.toString();
    }

    public List<String> decode(String str) {
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
