import java.util.*;

public class Random {
    public static void main(String[] args) {
        ArrayList<String> fortunes = new ArrayList<>();
        java.util.Random fortuneRandom = new java.util.Random();

        fortunes.add("You will be rich.");
        fortunes.add("Keep going.");
        fortunes.add("Fight through it.");
        fortunes.add("Hope this works.");

        int index = fortuneRandom.nextInt(fortunes.size()); // generate random index into fortunes list
        String fortune = fortunes.get(index); // get fortune at random index

        System.out.println("Fortune: " + fortune);
    }
}
