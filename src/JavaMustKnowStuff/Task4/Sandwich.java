package JavaMustKnowStuff.Task4;

public class Sandwich implements FastFood {

    @Override
    public String getFood() {
        System.out.println("This return string: ");
        return "Food";
    }

    @Override
    public int food() {
        System.out.println("This return int: ");
        return 0;
    }
}
