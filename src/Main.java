public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Barsik", "white", 1, false, 10);
        cats[1] = new Cat("Flash", "black", 5, false, 15);
        cats[2] = new Cat("Bonya", "grey red", 2, false, 30);


        Plate plate = new Plate(100);


        cats[2].eat(plate);
        plate.info();



//        for(Cat i : cats){
//            i.eat();
//            plate.setFood(Plate.getFood() - .appetite);
//            Plate.info();
            }


        }


