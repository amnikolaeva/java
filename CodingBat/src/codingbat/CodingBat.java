package codingbat;

public class CodingBat {

    public static void main(String[] args) {
        
        CodingBat exercise = new CodingBat();
        int intMax = exercise.intMax(1, 2, 3);
        System.out.println(intMax);
        
        CodingBat exercise1 = new CodingBat();
        int close10 = exercise1.close10(7, 13);
        System.out.println(close10);

        CodingBat exercise2 = new CodingBat();
        boolean stringE = exercise2.stringE("Hello");
        System.out.println(stringE);

        CodingBat exercise3 = new CodingBat();
        String everyNth = exercise3.everyNth("Привет, мир", 2);
        System.out.println(everyNth);
    }
    
    public int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if(b > a && b > c) {
            return b;
        } 
            return c;
    }
    
    public int close10(int a, int b) {
        int x = 10 - a;
        int y = 10 - b;
        if (Math.abs(x) < Math.abs(y)) {
            return a;
        } if (Math.abs(x) > Math.abs(y)) {
            return b;
        } return 0;
    }

    public boolean stringE(String str) {
        int j = 0;
        for (int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == 'e') {
                j += 1;
            }
        }
        if (j <= 3 && j >= 1) {
            return true;
        }
        return false;
    }
    
    public String everyNth(String str, int n) {
        String newStr = "";
        for (int i = 0; i < str.length(); i = i + 2) {
            newStr += str.charAt(i);
        }
        return newStr;
    }

}
