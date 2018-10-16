package firstchapter;

public class FirstChapter {
    
    public static void main(String[] args) {
        
        Exercise myExercise = new Exercise();
        myExercise.beerSong();
        myExercise.phraseOMatic();
        myExercise.printChars();
        
        int x = 5;
        while (x > 3) {
            x = x - 1;
            System.out.println(x);
        }
    
        int y = 1;
        System.out.println("Перед началом цикла");
        while (y < 4) {
            System.out.println("Внутри цикла");
            System.out.println("Значение y равно " + y);
            y = y + 1;
        }
        System.out.println("После окончания цикла");
    
        int z = 2;
        if (z == 3) {
            System.out.println("Значение z равно " + z);
        }
        else {
            System.out.println("Значение x не равно 3");
        }
        System.out.println("Эта строчка выполняется в любом случае");
    
        int a = 1;
        while (a < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            a = a + 1;
        }
        if (a == 3) {
            System.out.println("Do");
        }
    } 
}
