import java.util.Scanner;

public class convert{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) { // main+enter
        System.out.println("helooooo poo"); // sysout

        // convertion na bess

        System.out.print("Enter temperature in celsius: ");
        double tempInCelsius = scan.nextDouble();
        double tempInFahrenheit = toFahrenheit(tempInCelsius);
        System.out.println(tempInCelsius + "°C is equal to " + tempInFahrenheit +
                "°F");

        // 2. Create a method to convert fahrenheit to celsius.
        System.out.print("Enter temperature in fahrenheit: ");
        tempInFahrenheit = scan.nextDouble();
        tempInCelsius = toCelsius(tempInFahrenheit);
        System.out.println(tempInFahrenheit + "°F is equal to " + tempInCelsius +
                "°C");

        // 3. Create a method to convert seconds to minutes.
        System.out.print("Enter time in seconds: ");
        double seconds = scan.nextDouble();
        double minutes = secondstoMinutes(seconds);
        System.out.println(seconds + " seconds is equal to " + minutes + " minutes");

        // 4. Create a method to convert hours to minutes.
        System.out.print("Enter time in hours: ");
        double hours = scan.nextDouble();
        minutes = hoursToMinutes(hours);
        System.out.println(hours + " hours is equal to " + minutes + " minutes");

        // 5. Create a method to convert megabytes to gigabytes.
        System.out.print("Enter storage value in megabytes: ");
        double megabytes = scan.nextDouble();
        double gigabytes = megabyteToGigabyte(megabytes);
        System.out.println(megabytes + " megabytes is equal to " + gigabytes + " gigabytes");
    }

    static double toFahrenheit(double temperature) {
        return (temperature * 9 /5) + 32;
    }
    static double toCelsius(double temperature){
         return (temperature - 32) * 5/9;
    }
    static double secondstoMinutes(double seconds) {
        return seconds / 60;
    }

    static double hoursToMinutes(double hours) {
        return hours * 60;

    }

    static double megabyteToGigabyte(double megabytes) {
        return megabytes / 1000;
    }
}
