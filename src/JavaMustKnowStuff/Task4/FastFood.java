package JavaMustKnowStuff.Task4;

public interface FastFood {

    String getFood();

    int food();

    default int foods() {
        System.out.println("\nThis is default foods() method from Interface");
        return 2;
    }
}
