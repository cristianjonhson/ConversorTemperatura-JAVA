public class ConversorTemperatura {
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static int celsiusAFahrenheitEntero(double celsius) {
        return (int) celsiusAFahrenheit(celsius);
    }
}