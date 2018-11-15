package codingbat;

public class Exercise2 {
    public String stringYak(String str) {
        String newStr = "";
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("yak")) {
                newStr += str.charAt(i + 3);
            }
            newStr += str.charAt(i);
        }
        return newStr;
    }

}