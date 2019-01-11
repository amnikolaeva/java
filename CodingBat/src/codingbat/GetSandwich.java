/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbat;

/**
 *
 * @author anuto
 */
public class GetSandwich {
    public String getSandwich(String str) {
        int pieces = countOfPieces(str);
        String res = "";
        if (pieces<2) {
            return "";
        }
        else {
            int last = lastBread(str);
            for (int i=0; i<str.length()-5; i++) {
            if (str.substring(i,i+5).equals("bread")) {
                res = str.substring(i+5, last);
                return res;
            }
            }
        }
        return res;
    }
        
    private int countOfPieces(String str) {
        int count = 0;
        if (str.length()<5) {
            return 0;
        }
        for (int i=0; i<=str.length()-5; i++) {
            if (str.substring(i,i+5).equals("bread")) {
                count++;
            }
        }
        return count;
    }
    
    private int lastBread(String str) {
        int last = 0;
        for (int i=0; i<=str.length()-5; i++) {
            if (str.substring(i,i+5).equals("bread")) {
                last = i;
            }
        }
        return last;
    }
}
