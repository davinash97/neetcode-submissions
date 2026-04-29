class Solution {
    char key = '~';
    public String encode(List<String> strs) {
        StringBuilder newStr = new StringBuilder();
        for (String str : strs) {
            newStr.append(str).append(key);
        }
        return newStr.toString();
    }

    public List<String> decode(String str) {
        List<String> strList = new ArrayList<>();
        StringBuilder newStr = new StringBuilder();
        char[] ch = str.toCharArray();
        for (char i : ch) {
            if(i == key){
                strList.add(newStr.toString());
                newStr.setLength(0);
            } else {
                newStr.append(i);
            }
        }
        return strList;
    }
}
