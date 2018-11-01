package codingbat;

public class CodingBat {

    public static void main(String[] args) {        
        CodingBat exercise = new CodingBat();
        boolean doubleX = exercise.doubleX("axxaaxx");
        System.out.println(doubleX);

        CodingBat exercise1 = new CodingBat();
        int stringMatch = exercise1.stringMatch("xxcaazz", "xxbaaz");
        System.out.println(stringMatch);
        
        CodingBat exercise2 = new CodingBat();
        String stringX = exercise2.stringX("xxcaazz");
        System.out.println(stringX);

        CodingBat exercise3 = new CodingBat();
        String altPairs = exercise3.altPairs("Chocolate");
        System.out.println(altPairs);
        
    }
    
    boolean doubleX(String str) {
        int ind = str.indexOf("x");
        for (int i = 0; i < str.length(); i ++) {
            if (ind != -1 && str.substring(ind, ind + 2).equals("xx")) {
                return true;
            }
        }
        return false;
    }
    
    public int stringMatch(String a, String b) {
        int count = 0;
        if (a.length() < b.length()) {
            for (int i = 0; i < a.length() - 1; i++) {
                String sub1 = a.substring(i, i + 2);
                String sub2 = b.substring(i, i + 2);
                if (sub1.equals(sub2)) {
                    count ++;
                }
            }
        } 
        else {
            for (int i = 0; i < b.length() - 1; i++) {
                String sub1 = a.substring(i, i + 2);
                String sub2 = b.substring(i, i + 2);
                if (sub1.equals(sub2)) {
                    count ++;
                }
            }
        }
            return count;
    }
    
    public String stringX(String str) {
        String strWithoutX = "";
        if (str.length() > 1) {
            for (int i = 1; i < str.length() - 1; i++) {
                if (str.charAt(i) != 'x') {
                    strWithoutX  += str.charAt(i); 
                }
            }
            String newStr = str.charAt(0) + strWithoutX + str.charAt(str.length() - 1);
            return newStr;
        }
        return str;
    }
    
    public String altPairs(String str) {
        String newStr = "";
        for (int i = 0; i <= str.length() - 1; i += 4) {
            if (i == str.length() - 1) {
                newStr += Character.toString(str.charAt(i));
            } else {
                newStr += Character.toString(str.charAt(i)) + Character.toString(str.charAt(i + 1));
            }
        }
        return newStr;
    }

}
