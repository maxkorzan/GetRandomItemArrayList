import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("yellow");
        colors.add("blue");
        colors.add("orange");
        colors.add("green");
        colors.add("purple");
        colors.add("pink");
        colors.add("gray");

        System.out.println(colors);

        System.out.print("Random color: "+colors.get(randomNumber(colors.size())));

    }

    //random number generator
    public static int randomNumber(int x){
        Random rand = new Random();
        int randnum = rand.nextInt(x);
        return randnum;
    }

}
