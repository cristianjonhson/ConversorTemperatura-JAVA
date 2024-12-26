public class Main {
    public static void main(String[] args) {
        // Conversión de Celsius a Fahrenheit
        double temperaturaCelsius = 25.0; // Puedes cambiar este valor para probar con diferentes temperaturas
        double temperaturaFahrenheit = ConversorTemperatura.celsiusAFahrenheit(temperaturaCelsius);
        System.out.println("La temperatura en Fahrenheit es: " + temperaturaFahrenheit);

        // Mostrar la temperatura en Fahrenheit sin decimales
        int temperaturaFahrenheitEntera = ConversorTemperatura.celsiusAFahrenheitEntero(temperaturaCelsius);
        System.out.println("La temperatura en Fahrenheit sin decimales es: " + temperaturaFahrenheitEntera);
    }
}