import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", "white", 1, false, 10);
        cats[1] = new Cat("Flash", "black", 5, false, 15);
        cats[2] = new Cat("Bonya", "grey red", 2, false, 30);


        Plate plate = new Plate(100);

        for (Cat j : cats) {
            do {
                for (int i = 0; i < cats.length; i++) {
                    cats[i].eat(plate);
                    plate.info();
                }
            } while (plate.food >= j.appetite && plate.food == 0);


//        for(Cat i : cats){
//            i.eat();
//            plate.setFood(Plate.getFood() - .appetite);
//            Plate.info();
        }

        plate.addEat(100);
        plate.info();
    }
}






