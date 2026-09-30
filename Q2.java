// Problem: Celsius temperature ko Fahrenheit mein convert karo.
class TemperatureConverter {
    static double celsiusToFahrenheit(double celsius) {
        // Formula: Fahrenheit = (Celsius * 9 / 5) + 32.
        return celsius * 9.0 / 5 + 32;
    }
}

public class Q2 {
   

     
    public static void main(String[] args) {
        // Sample temperature ko convert karke result print karte hain.
        double celsius = 41;
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.println("F = " + fahrenheit);
    }
}   