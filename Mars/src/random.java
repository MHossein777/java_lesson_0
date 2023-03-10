import java.util.Random;

public class random {
    public static void main(String[] args) {

        int random = (int)(Math.random() * 100 + 1);
        System.out.println("Generated random number: " + random);


        if (random % 2 == 0) {
            System.out.println(random + " is even.");
        } else {
            System.out.println(random + " is odd.");
        }
    }
}
