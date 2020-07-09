package OnlineRetailer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int count = 1;
    private long id;
    private LocalDate date;
    private User user;
    private List<Item> items;

    public Order() {
        id = count++;
        date = LocalDate.now();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void filterByType(List<Item> items) {
        List<Item> motorcycle = new ArrayList<>();
        List<Item> cars = new ArrayList<>();
        List<Item> motoparts = new ArrayList<>();
        List<Item> carparts = new ArrayList<>();
        for (Item item : items) {
            if (item.getItem().equals(Type.MOTORCYCLE)) {
                motorcycle.add(item);
            } else if (item.getItem().equals(Type.CAR)) {
                cars.add(item);
            } else if (item.getItem().equals(Type.CARPARTS)) {
                motoparts.add(item);
            } else {
                carparts.add(item);
            }
        }
        System.out.println("Motorcycle: " + motorcycle);
        System.out.println("Motorcycle parts: " + motoparts);
        System.out.println("Cars: " + cars);
        System.out.println("Cars parts: " + carparts);
    }

    @Override
    public String toString() {
        return "Order Id: " + id + "\nOrder date: " + date + "\n" + user.toString();
    }
}
