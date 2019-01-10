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
public class ChocolateFactory {
    /**
     * Собрать необходимый вес шоколада из больших и маленьких шматов
     * @param small - шмат весом 1кг
     * @param big - шмат весом 5кг
     * @param goal - вес в кг., который необходимо собрать
     * @return количество маленьких шматов, из которых состоит комплект. -1 если комплект собрать нельзя
     */
    public int makeChocolate(int small, int big, int goal) {
        int bucket = 0;
        while (big > 0 && bucket <= goal - 5) {
            bucket+=5;
            big--;
        }
        int residue = goal - bucket;
        if (residue <= small) {
            return residue;
        }
        return -1;
    }
}
