public class Cat {
    String name;
    String color;
    int age;
    boolean satiety;
    int appetite;

    public Cat(String name, String color, int age, boolean satiety, int appetite) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.satiety = false;
        this.appetite = appetite;
    }


    public void eat(Plate p) {
        if (p.food > appetite) {
            p.decreaseFood(appetite);
            System.out.println(name + " omnomnom");
            satiety = true;
            System.out.println(name + " satisfied");
        } else {
            System.out.println("There is not enough food in the plate for " + name);
        }
    }
}
