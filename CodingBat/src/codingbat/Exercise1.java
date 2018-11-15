package codingbat;

public class Exercise1 {
    public boolean doubleX(String str) {
        int ind = str.indexOf("x");
        if (ind != str.length() - 1) {
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
    
    public boolean noTriples(int[] nums) {
        if (nums.length > 2) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = 0; j < 10; j++) {
                    if (nums[i] == j && nums[i + 1] == j && nums[i + 2] == j) {
                        return false;
                    }
                }
            }        
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; i < 10; j++) {
                if (nums[i] == j && nums[i + 1] == j + 5 && nums[i + 2] == j - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public String stringBits(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i += 2) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

    public String stringYak(String str) {
        String newStr = "";
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("yak")) {
            }
            newStr += str.charAt(i);
        }
        return newStr;
    }
}
