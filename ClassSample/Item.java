public class Item {

    // Items Attributes

    String name;
    Double price;
    Double weight;
    int power;
    int reliability;
    String ammo;
    String description;
    Boolean tradeable;



    // Items Method

    public void itemDescription() {

        System.out.println("\nName: " + name + "\n" + "Price: " + price + " | Weight: " + weight + "\n" + "Power: " + power + " | Reliability: " + reliability + "\n" + "Ammo Type: " + ammo + " | Can be traded: " + tradeable + "\n" + "Description: " + description);

    }



    // Constructor

    public Item(String itemName, Double itemPrice, Double itemWeight, int itemReliability, String itemAmmoType, String itemDescription, Boolean canBeTraded) {

        name = itemName;
        price = itemPrice;
        weight = itemWeight;
        reliability = itemReliability;
        ammo = itemAmmoType;
        description = itemDescription;
        tradeable = canBeTraded;

    }

}
