package firstchapter;

public class Exercise {
    public void beerSong() {
        int beerNum = 99;
        String word = " бутылок (бутылки)";
            
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = " бутылка";
            }
            System.out.println(beerNum + word + " пива на стене");
            System.out.println(beerNum + word + " пива.");
            System.out.println("Возьми одну, пусти по кругу.");
            beerNum = beerNum - 1;
        }
        System.out.println("Нет бутылок пива на стене");
    }
    
    public void phraseOMatic() {
        String[] wordListOne = {"умная", "добрая",
            "порядочная", "хорошая", "красивая"
        };
        String[] wordListTwo = {"кошка", "котень", "котейка",
            "хозяйка", "кошка-морская свинка", "хазантре"
        };
        String[] wordListThree = {"победила", "стала программистом",
            "устроилась стажером", "выиграла конкурс"            
        };
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println(phrase);
    }
    
    public void printChars() {
        int x = 3;
        while (x >= 1) {
            if (x > 2) {
                System.out.print("a");
            }
            if (x == 2) {
                System.out.print("b, c");
            }
            if (x == 1) {
                System.out.println("d");
            }
            x = x - 1;
            if (x != 0) {
                System.out.print("-");
            }
        }
    }
}
