# Conversor de Temperatura

Este proyecto es un programa simple en Java que convierte una temperatura de grados Celsius a Fahrenheit. También muestra la temperatura en Fahrenheit sin decimales.

## Estructura del Proyecto

El proyecto contiene dos clases principales:

1. `ConversorTemperatura`: Esta clase contiene métodos estáticos para convertir temperaturas de Celsius a Fahrenheit.
2. `Main`: Esta clase contiene el método `main` que utiliza la clase `ConversorTemperatura` para realizar la conversión y mostrar los resultados.

## Uso

Para utilizar este programa, simplemente ejecuta la clase `Main`. Puedes cambiar el valor de la variable `temperaturaCelsius` en la clase `Main` para probar con diferentes temperaturas.

### Ejemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        double temperaturaCelsius = 25.0; // Cambia este valor para probar con diferentes temperaturas
        double temperaturaFahrenheit = ConversorTemperatura.celsiusAFahrenheit(temperaturaCelsius);
        System.out.println("La temperatura en Fahrenheit es: " + temperaturaFahrenheit);

        int temperaturaFahrenheitEntera = ConversorTemperatura.celsiusAFahrenheitEntero(temperaturaCelsius);
        System.out.println("La temperatura en Fahrenheit sin decimales es: " + temperaturaFahrenheitEntera);
    }
}
```

## Cómo Ejecutar

1. Asegúrate de tener [Java](https://www.oracle.com/java/technologies/javase-downloads.html) instalado en tu máquina.
2. Compila las clases con el siguiente comando:

    ```bash
    javac src/*.java
    ```
3. Ejecuta la clase `Main`:
    ```bash
    java -cp src Main
    ```

## Contribuciones

Las contribuciones son bienvenidas. Siéntete libre de abrir un issue o enviar un pull request.

## Licencia

Este proyecto está bajo la Licencia MIT.