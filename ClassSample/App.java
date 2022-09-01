public class App {
    public static void main(String[] args) {

        Item Sword = new Item("Sword", 2.000, 40.00, 70, "5.56", "Metal", true);
        Sword.itemDescription();

        Item Shield = new Item("Shield", 15.000, 80.00, 80, "7.67", "Defense", true);
        Shield.itemDescription();

        Item Gun = new Item("Gun", 20.000, 20.00, 50, "59.00", "Protection", true);
        Gun.itemDescription();

        Pet dog = new Pet ("Dog", "Bugart", 5, 8, true);
        dog.petDescription();
        Pet cat = new Pet ("Cat", "Kettenn", 7, 4, true);
        cat.petDescription();
        Pet rabbit = new Pet ("Rabbit", "Bitten", 9, 5, true);
        rabbit.petDescription();


        

    }
}
