package JavaMustKnowStuff.Task4;

public interface FastFood {

    String getFood();

    int food();

    default int foods() {
        System.out.println("This is default foods() method");
        return 2;
    }
}
