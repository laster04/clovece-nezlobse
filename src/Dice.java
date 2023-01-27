import java.awt.*;
import java.util.Random;

public class Dice {
    static Random rand = new Random();

    public static int roll() {
        return rand.nextInt(6) + 1;
    }

    public static Color rgbColor() {
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        return new Color(r, g, b);
    }
}
