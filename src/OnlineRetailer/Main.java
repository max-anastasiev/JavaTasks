package OnlineRetailer;

import java.util.*;

public class Main {
    private static Scanner userInput = new Scanner(System.in);
    private static Map<String, Address> addrMap = new HashMap<>();
    private static List<Item> vehicleList = new ArrayList<>();
    private static List<Item> cart = new ArrayList<>();
    private static User user = new User();
    private static Order order = new Order();

    public static void main(String[] args) {
        createUser();
        addressEntry();
        populateList(vehicleList);
        askUser(vehicleList);
        createOrder(user, cart);
    }

    private static void createUser() {
        System.out.println("Hello Enter your username.");
        String userName = userInput.nextLine();
        user.setUsername(userName);
    }

    private static void askUser(List<Item> list) {
        String keepsShopping = "y";
        do {
            System.out.println("Would you like to add items to your cart? To add items enter item number from the below list, or press 0 key to leave.");
            for (Item i : vehicleList) {
                System.out.println(i.toString());
            }
            int item = userInput.nextInt();
            if (item == 0) {
                keepsShopping = "n";
            } else if (item < 0 || item > 12) {
                System.out.println("Please enter a valid item!");
            } else {
                cart.add(vehicleList.get(item - 1));
                System.out.println(cart.toString());
            }
        }
        while (keepsShopping.toLowerCase().equals("y"));
    }

    private static void addressEntry() {
        Address shippingAddr = new Address();
        System.out.println("Provide your shipping address.");
        System.out.println("Country:");
        String country = userInput.nextLine().toUpperCase();
        shippingAddr.setCountry(country);
        getAddress(shippingAddr);
        addrMap.put("Shipping", shippingAddr);
        user.setAddress(addrMap);
    }

    private static void getAddress(Address addr) {
        userInput.nextLine();
        System.out.println("City: ");
        addr.setCity(userInput.nextLine().toUpperCase());
        System.out.println("House number and street:");
        addr.setAddressLine1(userInput.nextLine().toUpperCase());
    }

    private static void populateList(List<Item> list) {
        list.add(new Item("BMW", Type.CAR));
        list.add(new Item("Honda", Type.CAR));
        list.add(new Item("Ford", Type.CAR));
        list.add(new Item("Triumph", Type.MOTORCYCLE));
        list.add(new Item("BMW Motorcycle", Type.MOTORCYCLE));
        list.add(new Item("Kawasaki", Type.MOTORCYCLE));
        list.add(new Item("KYB", Type.CARPARTS));
        list.add(new Item("WEICHERS", Type.CARPARTS));
        list.add(new Item("VeilSide", Type.CARPARTS));
        list.add(new Item("Brembo", Type.MOTOPARTS));
        list.add(new Item("Scorpion", Type.MOTOPARTS));
        list.add(new Item("Wossner", Type.MOTOPARTS));
    }

    private static void createOrder(User user, List<Item> cart) {
        order.setUser(user);
        order.setItems(cart);
        System.out.println(order);
        System.out.println("Items in cart: ");
        order.filterByType(cart);
    }
}