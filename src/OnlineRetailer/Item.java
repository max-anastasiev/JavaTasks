package OnlineRetailer;

public class Item {
    private static int counter = 1;
    private final long id;
    private String title;
    private Type item;

    public Item(String title, Type item) {
        id = counter++;
        this.title = title;
        this.item = item;
    }

    public Type getItem() {
        return item;
    }

    @Override
    public String toString() {
        return id + ": " + title;
    }
}