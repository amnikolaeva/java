package codingbat;

public class CodingBat {

    public static void main(String[] args) {        
        CodingBat exercise = new CodingBat();
        boolean doubleX = exercise.doubleX("axxaaxx");
        System.out.println(doubleX);
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
}
