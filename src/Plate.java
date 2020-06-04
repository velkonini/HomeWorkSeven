import java.util.Scanner;

public class Plate {

    int food;


    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n){
        food -= n;
    }


    public void info(){
        System.out.println("plate:" + food);
    }

    public void addEat(int x){
        food = food + x;
        }
    }

