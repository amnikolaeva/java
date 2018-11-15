package codingBat;

public class String {
    public String nTwice(String str, int n) {
        String firstChars = str.substring (0, str.length() - n);
        String lastChars = str.substring (str.length() - n);
        return firstChars + lastChars;
    }

}
