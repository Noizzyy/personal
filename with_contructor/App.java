public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(8, 6, 3, "Bape");
        // Calls the sayMyName method
        knight.sayMyName();

        // Creates a new object named "mage" from Character class
        Character mage = new Character(2, 3, 10, "Arkin");
        // Calls the sayMyName method
        mage.sayMyName();

        // Creates a new object named "mage" from Character class
        Character thief = new Character(10, 6, 1, "Grangga");
        // Calls the sayMyName method
        thief.sayMyName();

        // Creates a new object named "mage" from Character class
       Character archer = new Character(3, 3, 10, "Vaxian");
       // Calls the sayMyName method
       archer.sayMyName();

       // Creates a new object named "mage" from Character class
       Character healer = new Character(10, 0, 4, "Feltie");
       // Calls the sayMyName method
       healer.sayMyName();
    }
}
